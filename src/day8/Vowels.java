package day8;

public class Vowels {
    static public  int getVowel(String name ){
        int count=0;
        char[] namearr=name.toLowerCase().toCharArray();
        for(int i=0;i<namearr.length;i++){
            char c = namearr[i];
            if (c=='a'|| c=='e' || c=='i'|| c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
       int result= getVowel("ddfvdxdfbxhbfsfzsxjdfjejersz");
        System.out.println("count of vowels are:"+result);
    }

}
