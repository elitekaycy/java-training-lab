package Multithread.SimpleThread;

public class DownloadTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading file...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File downloaded successfully.");
    }
}