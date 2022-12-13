package vendingmachine.controller;

import vendingmachine.model.Products;
import vendingmachine.model.VendingMachine;
import vendingmachine.view.InputView;

public class VendingMachineController {
    private final InputView inputView;
    private VendingMachine vendingmachine;
    private Products products;

    public VendingMachineController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {

    }

    private void makeVendingMachine() {
        int vendingMachineMoney = inputView.getVendingMachineMoney();
        vendingmachine = new VendingMachine(vendingMachineMoney);
    }
}
