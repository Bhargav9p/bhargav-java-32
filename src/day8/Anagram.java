package day8;

import java.util.Arrays;

public class Anagram {
    static void getCheck (String fstr,String lstr){
        String s1= fstr.replace("\\s","");
        String s2= lstr.replace("\\s","");
        boolean status=true;
        if(fstr.length()!=lstr.length()){
            status =false;
        }else {
            char[] arrys1= s1.toLowerCase().toCharArray();
            char[] arrys2= s2.toLowerCase().toCharArray();
            Arrays.sort(arrys1);
            Arrays.sort(arrys2);
            status=Arrays.equals(arrys1,arrys2);
        }
        if(status){
            System.out.println(s1 + " and " + s2 + " are anagrams");
        }else {
            System.out.println(s1 + " and " + s2 + " are not a anagrams");
        }
    }
    public static void main(String[] args){
        getCheck("keep","peek");
    }
}
