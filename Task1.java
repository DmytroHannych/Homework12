package module12;

public class Task1 extends Thread {
    public static void main(String[] args) {
    Thread thread1 = new Thread1();
    thread1.start();
    Thread thread2 = new Thread2();
    thread2.start();
    }
}