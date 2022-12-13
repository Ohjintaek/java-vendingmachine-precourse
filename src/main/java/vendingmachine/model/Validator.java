package vendingmachine.model;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Validator {
    public static final String error = "[ERROR] ";
    public static final String format = "^\\[[a-zA-Z0-9가-힣]+,\\d+,\\d+]$";
    public static final int MIN_PRICE = 100;

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

    public static void isValidProduct(String product) {
        if (!Pattern.matches(format, product)) {
            throw new IllegalArgumentException(error + "잘못된 형식의 상품명을 입력했습니다.");
        }
    }

    public static void isOverHundred(int number) {
        if (number < MIN_PRICE) {
            throw new IllegalArgumentException(error + "상품 금액은 100원 이상이어야 합니다.");
        }
    }

    public static void isDuplicateProduct(String product, List<String> productSet) {
        if (productSet.contains(product)) {
            throw new IllegalArgumentException(error + "동일한 상품을 입력했습니다.");
        }
    }
}
