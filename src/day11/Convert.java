package day11;

import java.util.Scanner;

public class Convert {
    static void converingToInterger (String numb){
        try {
            int i = Integer.parseInt(numb);
            System.out.println("Entered String value is:"+numb);
        }catch (NumberFormatException ex) {
            System.out.println("converting String to IntergerValue:"+numb);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String value:");
        String name = sc.nextLine();
        converingToInterger(name);
    }
}
