package day14;

import java.util.Arrays;

public class CapitalizeAndSortStrings {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "carrot", "date"};
        capitalizeFirstLetter(strings);
        Arrays.sort(strings);

        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void capitalizeFirstLetter(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            if (str.length() > 0) {
                char firstChar = Character.toUpperCase(str.charAt(0));
                strings[i] = firstChar + str.substring(1);
            }
        }
    }
}

