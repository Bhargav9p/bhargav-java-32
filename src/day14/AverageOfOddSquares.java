package day14;

public class AverageOfOddSquares {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average = calculateAverageOfOddSquares(numbers);

        System.out.println("Average of squares of odd numbers: " + average);
    }

    public static double calculateAverageOfOddSquares(int[] numbers) {
        int sum = 0;
        int count = 0;

        for (int num : numbers) {
            if (num % 2 != 0) { // check if number is odd
                int square = num * num;
                sum += square;
                count++;
            }
        }

        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0.0; // if no odd numbers are found, return 0 as average
        }
    }
}

