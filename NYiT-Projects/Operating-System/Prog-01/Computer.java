import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Computer {

    public static void main(String[] args) throws InterruptedException {
        UserCommunity u1 = new UserCommunity("User01");
        UserCommunity u2 = new UserCommunity("User02");
        UserCommunity u3 = new UserCommunity("User03");
        UserCommunity u4 = new UserCommunity("User04");
        UserCommunity u5 = new UserCommunity("User05");

        LinkedList<PCB> pcbQueue = new LinkedList();
        RandomNumBetweenRange randonNum = new RandomNumBetweenRange();
        long startTime = System.currentTimeMillis();
        long processTime = startTime;
        int totPcbs = 0;

        getReportExecution (pcbQueue.size(), 0, (pcbQueue.size() - totPcbs), pcbQueue);
        TimeUnit.SECONDS.sleep((int) randonNum.getRandomNumber(1, 5));

        while (pcbQueue.size() < 40)  {
            switch((int) randonNum.getRandomNumber(1, 5)) {
                case 1:
                    pcbQueue.add(new PCB((pcbQueue.size()+1), u1.getUserName()));
                    break;
                case 2:
                    pcbQueue.add(new PCB((pcbQueue.size()+1), u2.getUserName()));
                    break;
                case 3:
                    pcbQueue.add(new PCB((pcbQueue.size()+1), u3.getUserName()));
                    break;
                case 4:
                    pcbQueue.add(new PCB((pcbQueue.size()+1), u4.getUserName()));
                    break;
                case 5:
                    pcbQueue.add(new PCB((pcbQueue.size()+1), u5.getUserName()));
                    break;
            }

            TimeUnit.SECONDS.sleep((int) randonNum.getRandomNumber(1, 5));
            if (((System.currentTimeMillis() - processTime) / 1000) >= 20) {
                getReportExecution (pcbQueue.size(), pcbQueue.getLast().getPid(), (pcbQueue.size() - totPcbs), pcbQueue);
                processTime = System.currentTimeMillis();
                totPcbs = pcbQueue.size();
            }
        }
        getReportExecution (pcbQueue.size(), pcbQueue.getLast().getPid(), (pcbQueue.size() - totPcbs), pcbQueue);

        //Report Final
        getFinalReport(pcbQueue, ((System.currentTimeMillis() - startTime) / 1000));
    }

    private static void getFinalReport (LinkedList<PCB> pcbQueue, long totalProcessTime) {
        String strProcessDetails = "";
        for (int i=0; i <= pcbQueue.size()-1; i++) {
            strProcessDetails += "\n PID:" + pcbQueue.get(i).getPidStr().format("%1$-2s", pcbQueue.get(i).getPidStr()) + "    STATUS:" + pcbQueue.get(i).getState()
                              +  "     USER:" + pcbQueue.get(i).getUser() + "         MEMORY FRAMES:" + pcbQueue.get(i).getMemSize()
                              +  " FIRTS FRAME:" + pcbQueue.get(i).getFirstFrame() + "       LAST FRAME:" + pcbQueue.get(i).getLastFrame()
                              +  "       START TIME:" + pcbQueue.get(i).getStartTime();
        }
        System.out.println("=========================================== PROCESSES QUEUE DETAILS ==========================================\n"
                +   new Date()
                +   "\n--------------------------------------------------------------------------------------------------------------"
                +   strProcessDetails
                +   "\n==============================================================================================================\n"
                +   "BUILD SUCCESSFUL (total time: " + totalProcessTime/60 +  " minutes " + totalProcessTime%60 +  " seconds)");
    }

    private static void getReportExecution (int queueSize, int lastProcId, int numProcLastExec, LinkedList<PCB> pcbQueue) {
        int contUser01=0, contUser02=0, contUser03=0, contUser04=0, contUser05=0;
        String strUsersProc = "";
        if (queueSize>0) {
            for (int i=0; i <= pcbQueue.size()-1; i++) {
                switch (pcbQueue.get(i).getUser()) {
                    case "User01":
                        contUser01++;
                        break;
                    case "User02":
                        contUser02++;
                        break;
                    case "User03":
                        contUser03++;
                        break;
                    case "User04":
                        contUser04++;
                        break;
                    case "User05":
                        contUser05++;
                        break;
                }
            }
            if (contUser01>0)strUsersProc += "\nUser01: " + contUser01 + " processes";
            if (contUser02>0)strUsersProc += "\nUser02: " + contUser02 + " processes";
            if (contUser03>0)strUsersProc += "\nUser03: " + contUser03 + " processes";
            if (contUser04>0)strUsersProc += "\nUser04: " + contUser04 + " processes";
            if (contUser05>0)strUsersProc += "\nUser05: " + contUser05 + " processes";
        }

        System.out.println("===> " + new Date()
                +   "\n============== PROCESSES QUEUE SUMMARY =============="
                +   strUsersProc
                +   "\n-----------------------------------------------------"
                +   "\nTotal number of processes currently in queue    : " + queueSize
                +   "\nLast created process ID                         : " + lastProcId
                +   "\nNumber of processes created since last report   : " + numProcLastExec
                +   "\n-----------------------------------------------------\n\n");
    }

}
