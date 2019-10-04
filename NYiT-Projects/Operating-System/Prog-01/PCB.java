import java.util.Date;

public class PCB {
    protected int pid;
    protected String state;
    protected String user;
    protected int memSize;
    protected int firstFrame;
    protected int lastFrame;
    protected Date startTime;


    public PCB(int pid, String user) {
        RandomNumBetweenRange randonNum = new RandomNumBetweenRange();

        this.pid = pid; //(int) randonNum.getRandomNumber(1, 99);
        this.state = "Running";
        this.user = user;
        this.memSize = (int) randonNum.getRandomNumber(41943, 20972);
        this.firstFrame = -1;
        this.lastFrame = -1;
        this.startTime = new Date();
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
