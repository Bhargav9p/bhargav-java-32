package day6;

public class FizzBuzz {
    public void check(){
        for (int i=0;i<=100;i++){
            System.out.println("total numbers is :"+i);
            if(i%3==0){
                System.out.println("Fizz numbers ");
            } else if (i%5==0) {
                System.out.println("Buzz numbers");
            } else if (i%3==0 || i%5==0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println("the number is not divisible by 3 and 5");
            }
        }
    }
    public static void main(String[] args){
        FizzBuzz fb =new FizzBuzz();
        fb.check();
    }
}
