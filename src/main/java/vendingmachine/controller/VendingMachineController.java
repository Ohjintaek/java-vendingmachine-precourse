package vendingmachine.controller;

import vendingmachine.model.Products;
import vendingmachine.model.VendingMachine;
import vendingmachine.model.Validator;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

import java.util.HashMap;
import java.util.List;

public class VendingMachineController {
    private final InputView inputView;
    private final OutputView outputView;
    private VendingMachine vendingMachine;
    private Products products;
    private int userMoney;

    public VendingMachineController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.vendingMachine = new VendingMachine();
        this.products = new Products();
    }

    public void run() {
        makeVendingMachine();
        storeProduct();
        buyProduct();
        returnMoney();
    }

    private void makeVendingMachine() {
        int vendingMachineMoney = inputView.getVendingMachineMoney();
        outputView.showVendingMachineMoney(vendingMachine.setCoins(vendingMachineMoney));
    }

    private void storeProduct() {
        List<String> tmpProducts = inputView.getProduct();
        for (String product : tmpProducts) {
            Validator.isValidProduct(product);
            products.addProduct(product);
        }
    }

    private void buyProduct() {
        userMoney = inputView.getMoney();
        outputView.showUserMoney(userMoney);

        while(products.canBuyProduct(userMoney)) {
            userMoney -= products.buyProduct(inputView.getProductName());
            outputView.showUserMoney(userMoney);
        }
    }

    private void returnMoney() {
        HashMap<Integer, Integer> returnCoins = vendingMachine.setReturnCoins(userMoney);
        outputView.showReturnCoins(returnCoins);
    }
}
