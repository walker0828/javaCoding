package multiThread;

public class MyThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.print("Hello world");
        }
    }
}
