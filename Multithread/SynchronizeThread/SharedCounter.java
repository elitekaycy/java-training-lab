package Multithread.SynchronizeThread;
public class SharedCounter {
    private volatile int count = 0;

    public SharedCounter(){}

    public void increment() {
        synchronized (this) {
            count++;
        }
    };

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }
}
