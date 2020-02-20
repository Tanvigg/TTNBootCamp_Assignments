package MultiThreadingAssess.Question9;

import java.util.concurrent.CountDownLatch;

public class Process9 implements Runnable {
    private CountDownLatch latch;

    public Process9(CountDownLatch latch) {
        this.latch=latch;
    }

    public void run() {
        System.out.println("Started.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        latch.countDown();
    }

}
