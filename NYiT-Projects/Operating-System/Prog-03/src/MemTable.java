public class MemTable {
    private int pid;
    private int firstFrame;
    private int lastFrame;
    private boolean isDeleted;
    private boolean isResuable;
    private int procMemSize;
    private int firstUnusedFrame;
    private int lastUnusedFrame;
    private int sizeUnusedFrame;

    public MemTable(int pid, int firstFrame, int lastFrame, int procMemSize, boolean isResuable, int firstUnusedFrame, int lastUnusedFrame, int sizeUnusedFrame) {
        this.pid = pid;
        this.firstFrame = firstFrame;
        this.lastFrame = lastFrame;
        this.procMemSize = procMemSize;
        this.isDeleted = false;
        this.isResuable  = isResuable;
        this.firstUnusedFrame = firstUnusedFrame;
        this.lastUnusedFrame = lastUnusedFrame;
        this.sizeUnusedFrame = sizeUnusedFrame;
    }

    public int getFirstUnusedFrame() {
        return firstUnusedFrame;
    }

    public int getLastUnusedFrame() {
        return lastUnusedFrame;
    }

    public int getSizeUnusedFrame() {
        return sizeUnusedFrame;
    }

    public boolean isResuable() {
        return isResuable;
    }

    public void setResuable(boolean resuable) {
        isResuable = resuable;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public int getPid() {
        return pid;
    }

    public int getFirstFrame() {
        return firstFrame;
    }

    public int getLastFrame() {
        return lastFrame;
    }

    public int getProcMemSize() {
        return procMemSize;
    }

    public int returnFreeSize () {
        int freeSize=(this.isResuable) ? (this.lastFrame - this.firstFrame)+sizeUnusedFrame+1 : (this.lastFrame - this.firstFrame)+1;
        return freeSize;
    }
}
