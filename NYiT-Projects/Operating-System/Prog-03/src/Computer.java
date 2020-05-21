import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Computer {

    private static boolean delProc = false;
    private static LinkedList<PCB> pcbQueue = new LinkedList();
    private static int numProcLestTerm = 0;
    private static boolean isMemoryLeft=true;
    private static LinkedList<MemTable> memTable = new LinkedList();
    static final int MAX_MEM_SIZE = 2097152;

    public static void main(String[] args) throws InterruptedException {
        UserCommunity u1 = new UserCommunity("User01");
        UserCommunity u2 = new UserCommunity("User02");
        UserCommunity u3 = new UserCommunity("User03");
        UserCommunity u4 = new UserCommunity("User04");
        UserCommunity u5 = new UserCommunity("User05");

        RandomNumBetweenRange randonNum = new RandomNumBetweenRange();
        long startTime = System.currentTimeMillis();
        long processTime = startTime;
        int totPcbs = 0;
        int contPcbs = 0;
        Memory myMemory = new Memory();

        getReportExecution (pcbQueue.size(), 0, (pcbQueue.size() - totPcbs), 0, myMemory.getMemTable());
        TimeUnit.SECONDS.sleep((int) randonNum.getRandomNumber(1, 5));

        //while (contPcbs < 12)  {
        while (isMemoryLeft)  {
            contPcbs++;
            switch((int) randonNum.getRandomNumber(1, 5)) {
                case 1:
                    pcbQueue.add(new PCB((contPcbs), u1.getUserName()));
                    isMemoryLeft = pcbQueue.getLast().getIsMemoryLeft();
                    if (!isMemoryLeft) pcbQueue.removeLast();
                    if (isMemoryLeft) deleteProcess();
                    break;
                case 2:
                    pcbQueue.add(new PCB((contPcbs), u2.getUserName()));
                    isMemoryLeft = pcbQueue.getLast().getIsMemoryLeft();
                    if (!isMemoryLeft) pcbQueue.removeLast();
                    if (isMemoryLeft) deleteProcess();
                    break;
                case 3:
                    pcbQueue.add(new PCB((contPcbs), u3.getUserName()));
                    isMemoryLeft = pcbQueue.getLast().getIsMemoryLeft();
                    if (!isMemoryLeft) pcbQueue.removeLast();
                    if (isMemoryLeft) deleteProcess();
                    break;
                case 4:
                    pcbQueue.add(new PCB((contPcbs), u4.getUserName()));
                    isMemoryLeft = pcbQueue.getLast().getIsMemoryLeft();
                    if (!isMemoryLeft) pcbQueue.removeLast();
                    if (isMemoryLeft) deleteProcess();
                    break;
                case 5:
                    pcbQueue.add(new PCB((contPcbs), u5.getUserName()));
                    isMemoryLeft = pcbQueue.getLast().getIsMemoryLeft();
                    if (!isMemoryLeft) pcbQueue.removeLast();
                    if (isMemoryLeft) deleteProcess();
                    break;
            }

            TimeUnit.SECONDS.sleep((int) randonNum.getRandomNumber(1, 5));
            if (((System.currentTimeMillis() - processTime) / 1000) >= 20) {
                getReportExecution (pcbQueue.size(), pcbQueue.getLast().getPid(), ((numProcLestTerm + pcbQueue.size()) - totPcbs), numProcLestTerm, myMemory.getMemTable());
                processTime = System.currentTimeMillis();
                totPcbs = pcbQueue.size();
                numProcLestTerm = 0;
            }
        }
        getReportExecution (pcbQueue.size(), pcbQueue.getLast().getPid(), ((numProcLestTerm + pcbQueue.size()) - totPcbs), numProcLestTerm, myMemory.getMemTable());

        //Report Final
        getFinalReport(pcbQueue, ((System.currentTimeMillis() - startTime) / 1000));
    }

    private static void deleteProcess () throws InterruptedException {
        RandomNumBetweenRange randonNum = new RandomNumBetweenRange();
        int ind = (int) randonNum.getRandomNumber(0, pcbQueue.size()-1);
        Memory delMemAlloc = new Memory();

        if (!delProc) {
            delProc=true;
            return;
        }
        else {
            delProc=false;
            delMemAlloc.remMem(pcbQueue.get(ind).getPid());
            pcbQueue.remove(ind);
            numProcLestTerm++;
            TimeUnit.SECONDS.sleep((int) randonNum.getRandomNumber(1, 2));
            return;
        }
    }

    private static void getFinalReport (LinkedList<PCB> pcbQueue, long totalProcessTime) {
        String strProcessDetails = "";
        for (int i=0; i <= pcbQueue.size()-1; i++) {
            strProcessDetails += "\n PID:" + fixedLengthString(pcbQueue.get(i).getPidStr(),3) + "    STATUS:" + pcbQueue.get(i).getState()
                              +  "     USER:" + pcbQueue.get(i).getUser() + "         MEMORY FRAMES:" + pcbQueue.get(i).getMemSize()
                              +  " FIRST FRAME:" + fixedLengthString(pcbQueue.get(i).getFirstFrame(),7) + "       LAST FRAME:" + fixedLengthString(pcbQueue.get(i).getLastFrame(),7)
                              +  "       START TIME:" + pcbQueue.get(i).getStartTime();
        }
        System.out.println("=========================================== PROCESSES QUEUE DETAILS ==========================================\n"
                +   new Date()
                +   "\n--------------------------------------------------------------------------------------------------------------"
                +   strProcessDetails
                +   "\n==============================================================================================================\n"
                +   "BUILD SUCCESSFUL (total time: " + totalProcessTime/60 +  " minutes " + totalProcessTime%60 +  " seconds)");
    }

    private static String fixedLengthString(String string, int length) { return String.format("%1$"+length+ "s", string); }

    private static String fixedLengthString(int string, int length) {
        return String.format("%1$"+length+ "s", string);
    }

    private static void getReportExecution (int queueSize, int lastProcId, int numProcLastExec, int numProcLestTerm, LinkedList<MemTable> memTable) {
        int numFreeContChunks = 1, biggestFreeContChunks=MAX_MEM_SIZE+1, TotFreeMem = MAX_MEM_SIZE+1;
        String strMemChunks = "";
        String strFreeMemChucks = "FIRST FRAME:       0 LAST FRAME: " + MAX_MEM_SIZE + " SIZE: " + (MAX_MEM_SIZE+1) + "\n";

        if (memTable.size() > 0) {
            biggestFreeContChunks=0;
            TotFreeMem=0;
            strFreeMemChucks = "";
            for (int i = 0; i < memTable.size(); i++) {
                if (memTable.get(i).isResuable() && memTable.get(i).getSizeUnusedFrame() > 0) {
                    numFreeContChunks += 1;
                    biggestFreeContChunks = (biggestFreeContChunks > memTable.get(i).getSizeUnusedFrame()) ? biggestFreeContChunks : memTable.get(i).getSizeUnusedFrame();
                    strFreeMemChucks += "FIRST FRAME: " + fixedLengthString((memTable.get(i).getFirstUnusedFrame()), 7)  + " LAST FRAME: " + fixedLengthString(memTable.get(i).getLastUnusedFrame(),7)  + " SIZE: " + fixedLengthString(memTable.get(i).getSizeUnusedFrame(),7) + "\n";
                    TotFreeMem += memTable.get(i).getSizeUnusedFrame();
                } else if (memTable.get(i).isDeleted() && !memTable.get(i).isResuable()) {
                    numFreeContChunks += 1;
                    biggestFreeContChunks = (biggestFreeContChunks > memTable.get(i).getProcMemSize()) ? biggestFreeContChunks : memTable.get(i).getProcMemSize();
                    strFreeMemChucks += "FIRST FRAME: " + fixedLengthString((memTable.get(i).getFirstFrame()), 7)  + " LAST FRAME: " + fixedLengthString(memTable.get(i).getLastFrame(),7)  + " SIZE: " + fixedLengthString(memTable.get(i).getProcMemSize(),7) + "\n";
                    TotFreeMem += memTable.get(i).getProcMemSize();
                }

            }
            for (int i = memTable.size()-1; i >= 0; i--) {
                if (!memTable.get(i).isDeleted()) {
                    if (!memTable.get(i).isResuable()) {
                        TotFreeMem += ((MAX_MEM_SIZE+1)-(memTable.get(i).getLastFrame()+1));
                        biggestFreeContChunks = (biggestFreeContChunks > ((MAX_MEM_SIZE+1)-(memTable.get(i).getLastFrame()+1))) ? biggestFreeContChunks : ((MAX_MEM_SIZE+1)-(memTable.get(i).getLastFrame()+1));
                        strFreeMemChucks += "FIRST FRAME: " + fixedLengthString((memTable.get(i).getLastFrame() + 1),7)  + " LAST FRAME: " + (MAX_MEM_SIZE+1)  + " SIZE: " + fixedLengthString(((MAX_MEM_SIZE+1)-(memTable.get(i).getLastFrame()+1)),7) + "\n";
                    } else {
                        TotFreeMem += ((MAX_MEM_SIZE+1)-(memTable.get(i).getLastUnusedFrame()+1));
                        biggestFreeContChunks = (biggestFreeContChunks > ((MAX_MEM_SIZE+1)-(memTable.get(i).getLastUnusedFrame()+1))) ? biggestFreeContChunks : ((MAX_MEM_SIZE+1)-(memTable.get(i).getLastUnusedFrame()+1));
                        strFreeMemChucks += "FIRST FRAME: " + fixedLengthString((memTable.get(i).getLastUnusedFrame() + 1),7)  + " LAST FRAME: " + (MAX_MEM_SIZE+1)  + " SIZE: " + fixedLengthString(((MAX_MEM_SIZE+1)-(memTable.get(i).getLastUnusedFrame()+1)),7) + "\n";
                    }
                    break;
                }
            }
        }


        strMemChunks = ""
                +   "\n============================================== FREE MEMORY SUMMARY ==============================================="
                +   "\nNumber of free contiguous chunks: " + fixedLengthString(numFreeContChunks,3)  + "   Biggest chunk size (frames): " + fixedLengthString(biggestFreeContChunks,7)  + "  Total free memory (frames): " + fixedLengthString(TotFreeMem,7)  + "      "
                +   "\n------------------------------------------------------------------------------------------------------------------"
                +   "\n================== FREE MEMORY CHUNKS ==================="
                +   "\n" + strFreeMemChucks
                +   "---------------------------------------------------------";

        System.out.println("===> " + new Date()
                +   "\n============== PROCESSES QUEUE SUMMARY =============="
                +   "\n-----------------------------------------------------"
                +   "\nTotal number of processes currently in queue    : " + queueSize
                +   "\nLast created process ID                         : " + lastProcId
                +   "\nNumber of processes created since last report   : " + numProcLastExec
                +   "\nNumber of processes terminated since last report: " + numProcLestTerm
                +   "\n-----------------------------------------------------" + strMemChunks
                +   "\n");
    }

}
