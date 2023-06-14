package day11;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Main {
    public static void convertToCustomException() throws CustomException {
        try {
            // Simulating a runtime exception
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
        } catch (ArithmeticException e) {
            // Converting the runtime exception to the custom exception
            throw new CustomException("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        try {
            convertToCustomException();
        } catch (CustomException ce) {
            System.out.println("Custom Exception occurred: " + ce.getMessage());
        }
    }
}


