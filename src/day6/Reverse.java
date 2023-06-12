package day6;

public class Reverse {
    int rev=0;
    public int reversing(int number) {
        while (number != 0) {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }
        return rev;
    }
    public static void main (String[] args){
        Reverse r=new Reverse();
        int x = r.reversing(100);
        System.out.println("reversing of the number :"+x);
    }
}
