package day7;

public class Larsmall {
    public int getMax(int[] input){
        int max =Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>max){
                max=input[i];
            }
        }
        return max;
    }
    public int getmin(int[] input){
        int min = input[0];
        for(int i=0;i<input.length;i++){
            if(input[i]<min)
                min=input[i];
        }
        return min;
    }
    public static void main (String[] args){
        Larsmall s = new Larsmall();
        int [] input = new int[]{10,20,30,20,30,50};
        for (int i=0;i< input.length;i++){
            System.out.println(input[i]);
        }
        System.out.println("lowest value is:"+s.getmin(input));

    }
}
