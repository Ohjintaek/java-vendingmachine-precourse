package vendingmachine.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VendingMachine {
    private int money;
    private List<Product> products = new ArrayList<>();
    private HashMap<Integer, Integer> coins = new HashMap<>();

    VendingMachine(int money) {
        this.money = money;
        initCoins();
    }

    private void initCoins() {
        coins.put(Coin.COIN_500.getAmount(), 0);
        coins.put(Coin.COIN_100.getAmount(), 0);
        coins.put(Coin.COIN_50.getAmount(), 0);
        coins.put(Coin.COIN_10.getAmount(), 0);
    }

    private void setCoins(int userInput) {
        int money = userInput;
        List<Integer> change = List.of(500,100,50,10); // 하드코딩
        while (money != 0) {
            int tmpMoney = Randoms.pickNumberInList(change);
            if (money >= tmpMoney) {
                money -= tmpMoney;
                coins.put(tmpMoney, coins.get(tmpMoney) + 1);
            }
        }
    }
}
