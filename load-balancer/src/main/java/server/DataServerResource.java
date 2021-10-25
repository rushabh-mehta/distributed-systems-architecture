package server;

public class DataServerResource {
    long totalMemory;
    long freeMemory;
    long cores;

    public DataServerResource(long totalMemory, long freeMemory, long cores) {
        this.totalMemory = totalMemory;
        this.freeMemory = freeMemory;
        this.cores = cores;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public long getCores() {
        return cores;
    }
}
