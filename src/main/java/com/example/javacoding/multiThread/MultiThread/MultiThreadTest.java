package multiThread;

public class MultiThreadTest {
    public static void main(String[] args) {
        new MyThread();
        new MyThread().start();
        System.out.print("Main: Hello world");
    }
}
