package day14;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorter {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cat", "dog", "elephant"};

        Arrays.sort(array, Comparator.comparing(String::length)
                .thenComparing(Comparator.comparing((String s) -> s.charAt(s.length() - 1)).reversed()));

        System.out.println(Arrays.toString(array));
    }
}
