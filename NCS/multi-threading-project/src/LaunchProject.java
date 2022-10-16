class DownloadStatus implements Runnable {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes++;
    }
}


class DownloadFileTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Downloading file " + Thread.currentThread().getName());

        for (int i = 0; i < 10000; i++) {
            if)
        }

        System.out.println("Download complete " + Thread.currentThread().getName());
    }
}

public class LaunchProject {
    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();
        Thread thread = new Thread(status);
        thread.start();


    }
}
