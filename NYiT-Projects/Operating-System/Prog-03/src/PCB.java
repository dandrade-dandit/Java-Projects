import java.util.Date;

public class PCB {
    private int pid;
    private String state;
    private String user;
    private int memSize;
    private int firstFrame;
    private int lastFrame;
    private Date startTime;
    private boolean isMemoryLeft=true;


    public PCB(int pid, String user) {
        RandomNumBetweenRange randonNum = new RandomNumBetweenRange();
        Memory newMemAlloc = new Memory();
        int lastMemPos;
        int memSize;

        memSize = (int) randonNum.getRandomNumber(41943, 20972);
        //memSize = (int) randonNum.getRandomNumber(1, 10);

        if ((lastMemPos = newMemAlloc.addMem(memSize, pid)) == -1) {
            isMemoryLeft=false;
        } else {
            this.pid = pid; //(int) randonNum.getRandomNumber(1, 99);
            this.state = "Running";
            this.user = user;
            this.memSize = memSize;
            this.firstFrame = (lastMemPos+1)-this.memSize;
            this.lastFrame = lastMemPos;
            this.startTime = new Date();
        }
    }

    public boolean getIsMemoryLeft() {
        return isMemoryLeft;
    }

    public int getPid() {
        return pid;
    }

    public String getPidStr() {
        return String.valueOf(pid);
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getMemSize() {
        return memSize;
    }

    public void setMemSize(int memSize) {
        this.memSize = memSize;
    }

    public int getFirstFrame() {
        return firstFrame;
    }

    public void setFirstFrame(int firstFrame) {
        this.firstFrame = firstFrame;
    }

    public int getLastFrame() {
        return lastFrame;
    }

    public void setLastFrame(int lastFrame) {
        this.lastFrame = lastFrame;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
