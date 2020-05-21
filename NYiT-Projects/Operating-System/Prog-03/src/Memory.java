import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Memory {
    private static List<Short> memAlloc = new ArrayList<>();
    private static LinkedList<MemTable> memTable = new LinkedList();
    private int nextAlloc;
    static final int MAX_MEM_SIZE = 2097152;

    public LinkedList<MemTable> getMemTable() {
        return memTable;
    }

    //Item 2.1
    public int addMem (int memSize, int pcbNum) {

        int freeMemSize=0;
        //Verify if there are space in the begging of the list
        for (int i=0; i < memTable.size();i++) {
            freeMemSize = memTable.get(i).returnFreeSize();
            if (freeMemSize >=  memSize && memTable.get(i).isDeleted()) {
                int firstUnusedFrame = (freeMemSize >  memSize) ? ((((memTable.get(i).isResuable()) ? memTable.get(i).getLastUnusedFrame() : memTable.get(i).getLastFrame()) - (freeMemSize - memSize))+1)  : 0;
                int lastUnusedFrame = (freeMemSize >  memSize) ? ((memTable.get(i).isResuable()) ? memTable.get(i).getLastUnusedFrame() : memTable.get(i).getLastFrame()) : 0;  //memTable.get(i).getLastFrame()  : 0;

                MemTable tmpMemTable = new MemTable(pcbNum, memTable.get(i).getFirstFrame(), ((memTable.get(i).getFirstFrame()+memSize)-1), memSize, true,firstUnusedFrame,lastUnusedFrame, freeMemSize-memSize);
                memTable.set(i, tmpMemTable);
                for (int j = memTable.get(i).getFirstFrame(); j < (memTable.get(i).getFirstFrame()+memSize); j++) {
                    memAlloc.set(j, (short) pcbNum);
                }
                return (memTable.get(i).getFirstFrame()+memSize)-1;
            }
        }

        nextAlloc = memSize + memAlloc.size();

        //If the Mem Size is more than 2097152 return error...
        if ((memAlloc.size()+memSize) > MAX_MEM_SIZE) {
            System.out.println("!!!!!");
            System.out.println("Unable to find memory for process " + pcbNum +". Process requested " + memSize + " frames.");
            System.out.println();
            System.out.println();
            return -1;
        }

        //memTable
        memTable.add(new MemTable(pcbNum, (nextAlloc-memSize), (nextAlloc-1), memSize, false,0,0, 0));

        for (int i = memAlloc.size(); i < nextAlloc; i++) {
            memAlloc.add(i, (short) pcbNum);
        }
        return nextAlloc-1;
    }

    //Item 2.2
    public void remMem (int pcbNum) {
        int delPosIni = 0;
        int delPosLast = 0;
        int delSize = 0;

        for (int i=0; i < memTable.size();i++) {
            if (memTable.get(i).getPid() ==  pcbNum) {
                delPosIni = memTable.get(i).getFirstFrame();
                delPosLast = memTable.get(i).getLastFrame();
                delSize = memTable.get(i).getProcMemSize();
                memTable.get(i).setDeleted(true);
            }
        }

        for (int i = delPosIni; i <= delPosLast; i++) {
            if (memAlloc.get(i)==pcbNum) memAlloc.set(i, (short) -1);
        }
    }
}
