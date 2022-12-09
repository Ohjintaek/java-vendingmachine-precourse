package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String getVendingMachineMoney() {
        System.out.println(InputViewConstants.getVendingMachineMoneyMessage);
        String userInput = Console.readLine();

        //예외 처리

        return userInput;
    }

    public String getProduct() {
        System.out.println(InputViewConstants.getProductMessage);
        String userInput = Console.readLine();

        //예외처리

        return userInput;
    }

    public String getMoney() {
        System.out.println(InputViewConstants.getMoneyMessage);
        String userInput = Console.readLine();

        //예외처리

        return userInput;
    }

    public String getProductName() {
        System.out.println(InputViewConstants.getProductNameMessage);
        String userInput = Console.readLine();

        //예외처리

        return userInput;
    }
}
