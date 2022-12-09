package vendingmachine.model;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int money;
    private List<Product> products = new ArrayList<>();
    private List<Coin> coins = new ArrayList<>();
}
