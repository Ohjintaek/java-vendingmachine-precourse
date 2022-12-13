package vendingmachine.controller;

import vendingmachine.model.Products;
import vendingmachine.model.VendingMachine;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class VendingMachineController {
    private final InputView inputView;
    private final OutputView outputView;
    private VendingMachine vendingMachine;
    private Products products;

    public VendingMachineController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.vendingMachine = new VendingMachine();
    }

    public void run() {
        makeVendingMachine();
    }

    private void makeVendingMachine() {
        int vendingMachineMoney = inputView.getVendingMachineMoney();
        outputView.showVendingMachineMoney(vendingMachine.setCoins(vendingMachineMoney));
    }
}
