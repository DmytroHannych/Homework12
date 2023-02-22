package module12;

public class Thread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
