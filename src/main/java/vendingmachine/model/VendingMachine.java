package vendingmachine.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VendingMachine {
    private int money;
    private List<Product> products = new ArrayList<>();
    private HashMap<Coin, Integer> coins = new HashMap<>();

    VendingMachine(int money) {
        this.money = money;
        initCoins();
    }

    private void initCoins() {
        coins.put(Coin.COIN_500, 0);
        coins.put(Coin.COIN_100, 0);
        coins.put(Coin.COIN_50, 0);
        coins.put(Coin.COIN_10, 0);
    }
}
