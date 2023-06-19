package day14;

public class StringsContainingVowels {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "open", "ai", "gpt"};

        for (String str : strings) {
            int vowelCount = countVowels(str);
            if (vowelCount > 0) {
                System.out.println("String: " + str);
                System.out.println("Number of vowels: " + vowelCount);
                System.out.println();
            }
        }
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // convert string to lowercase for easier comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}

