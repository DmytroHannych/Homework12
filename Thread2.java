package module12;

public class Thread2 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Минуло 5 секунд");
    }
}
