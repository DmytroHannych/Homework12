package module12;

public class Thread1 extends Thread {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (true) {
            long endTime = System.currentTimeMillis();
            long currentTime = (endTime - startTime) / 1000;
            System.out.println("currentTime = " + currentTime);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
