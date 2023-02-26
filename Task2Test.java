package module12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Task2 task2 = new Task2();
        service.submit(task2::fizz);
        service.submit(task2::buzz);
        service.submit(task2::fizzbuzz);
        service.submit(task2::number);
        service.submit(task2::print);
        service.shutdown();
    }
}
