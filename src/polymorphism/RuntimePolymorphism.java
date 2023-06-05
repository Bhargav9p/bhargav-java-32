package polymorphism;

public class RuntimePolymorphism {
    void run(){
        System.out.println("running");
    }
}
class Splendor extends RuntimePolymorphism {
    void run(){
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]){
        RuntimePolymorphism b = new Splendor();//upcasting
        b.run();
    }
}
