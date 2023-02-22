package module12;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class Task2 {
    public static BlockingDeque<String> deque = new LinkedBlockingDeque<>();
    private final int num = 15;
    public static volatile AtomicInteger currentNum = new AtomicInteger(1);

    public synchronized void add(String element){
        deque.add(element);
    }

public synchronized void fizz(){
    while (currentNum.get() < num) {
        if (currentNum.get() % 3 == 0 && currentNum.get() % 5 != 0){
            deque.add("fizz");
            currentNum.incrementAndGet();
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    }

    public synchronized void buzz(){
        while (currentNum.get() < num) {
            if (currentNum.get() % 3 != 0 && currentNum.get() % 5 == 0){
                deque.add("buzz");
                currentNum.incrementAndGet();
                notifyAll();
            } else {
                try {
                 wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void fizzbuzz(){
        while (currentNum.get() < num) {
            if (currentNum.get() % 3 == 0 && currentNum.get() % 5 == 0){
                deque.add("fizzbuzz");
                currentNum.incrementAndGet();
                notifyAll();
            } else {
                try {
                   wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void number(){
        while (currentNum.get() < num) {
            if (currentNum.get() % 3 != 0 && currentNum.get() % 5 != 0){
                deque.add(String.valueOf(currentNum));
                currentNum.incrementAndGet();
                notifyAll();
            } else {
                try {
                   wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void print(){
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (!deque.isEmpty()) {
                System.out.println(deque.poll());
            }
        }
    }
}



