package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;

import vendingmachine.model.Validator;

import java.util.List;

public class InputView {
    public int getVendingMachineMoney() {
        System.out.println(InputViewConstants.getVendingMachineMoneyMessage);
        String userInput = Console.readLine();
        System.out.println();

        int vendingMachineMoney = Validator.isValidNumber(userInput);
        Validator.isDividableTen(vendingMachineMoney);

        return vendingMachineMoney;
    }

    public List<String> getProduct() {
        System.out.println(InputViewConstants.getProductMessage);
        String userInput = Console.readLine();
        System.out.println();

        List<String> productSet = List.of(userInput.split(";"));
        for (String product : productSet) {
            Validator.isValidProduct(product);
        }

        return productSet;
    }

    public int getMoney() {
        System.out.println(InputViewConstants.getMoneyMessage);
        String userInput = Console.readLine();
        System.out.println();

        int userMoney = Validator.isValidNumber(userInput);

        return userMoney;
    }

    public String getProductName() {
        System.out.println(InputViewConstants.getProductNameMessage);
        String productName = Console.readLine();
        System.out.println();

        return productName;
    }
}
