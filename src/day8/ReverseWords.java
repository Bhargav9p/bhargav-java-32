package day8;

public class ReverseWords {
    String str="Java J2EE Reverse Me";

    public String reversedWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord +=sb.toString()+" ";
        }
        return reverseWord;
    }
    public static void main(String[] args) {
        ReverseWords s =new ReverseWords();
        String x =s.reversedWord(s.str);
        System.out.println(x);

    }
}
