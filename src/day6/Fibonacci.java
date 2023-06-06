package day6;
public class Fibonacci {
    int firstNumber=0;
    int secondNumber=1,nextNumber;
    public int series(int number){
        for(int i=0;i<number;i++){
            System.out.println(firstNumber+"");
            nextNumber = firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
        return number;
    }
    public static void main(String[] args){
        Fibonacci f =new Fibonacci();
        int x =f.series(10);
        System.out.println("the fibonacci series is :"+x);
    }
}

