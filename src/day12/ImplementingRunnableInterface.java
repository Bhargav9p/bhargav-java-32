package day12;

public class ImplementingRunnableInterface implements Runnable {

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("Implementing Runnable Interface  :: "+i);
        }
    }
    public static void main(String[] args){
        ImplementingRunnableInterface implementingRunnableInterface=new ImplementingRunnableInterface();
        Thread thread=new Thread(implementingRunnableInterface);
        thread.start();
    }
}
