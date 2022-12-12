package vendingmachine.model;

public class Validator {
    public static final String error = "[Error] ";
    public static int isValidNumber(String userInput) {
        isStartZero(userInput);
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(error + "숫자를 입력해주세요.");
        }
    }

    public static void isStartZero(String userInput) {
        if (userInput.startsWith("0")) {
            throw new IllegalArgumentException(error + "0으로 시작하지 않는 숫자를 입력해주세요.");
        }
    }

    public static void isDividableTen(int number) {
        if (number % 10 != 0) {
            throw new IllegalArgumentException(error + "10으로 나누어지는 숫자를 입력해주세요.");
        }
    }
}
