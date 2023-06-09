package day7;

import java.util.Arrays;

public class ReveArray {
    int start,end;
    public int[] getreversing(int[] input){

            int [] result= new int[input.length];
            int index=0;
            for(int i=input.length-1;i>=0;i--){
                result[index]=input[i];
                index++;

            }
            return  result;
        }

    public static void main(String[] args){
        int [] rev =new int[]{1,2,3,4,5};
        for (int i=0;i<rev.length;i++){
            System.out.println(rev[i]);
        }
        ReveArray s =new ReveArray();
        System.out.println("revers of the array is:"+ Arrays.toString(s.getreversing(rev)));

    }
}
