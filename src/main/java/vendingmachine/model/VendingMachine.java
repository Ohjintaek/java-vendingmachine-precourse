package vendingmachine.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class VendingMachine {
    private HashMap<Integer, Integer> coins = new LinkedHashMap<>();

    public VendingMachine() {
        initCoins();
    }

    private void initCoins() {
        coins.put(Coin.COIN_500.getAmount(), 0);
        coins.put(Coin.COIN_100.getAmount(), 0);
        coins.put(Coin.COIN_50.getAmount(), 0);
        coins.put(Coin.COIN_10.getAmount(), 0);
    }

    public HashMap<Integer, Integer> setCoins(int userInput) {
        int money = userInput;
        List<Integer> change = List.of(500,100,50,10); // 하드코딩
        while (money != 0) {
            int tmpMoney = Randoms.pickNumberInList(change);
            if (money >= tmpMoney) {
                money -= tmpMoney;
                coins.put(tmpMoney, coins.get(tmpMoney) + 1);
            }
        }

        return coins;
    }

    public HashMap<Integer, Integer> setReturnCoins(int userMoney) {
        HashMap<Integer, Integer> returnCoins = new LinkedHashMap<>();
        for (int coin : coins.keySet()) {
            int number = Math.min(userMoney / coin, coins.get(coin));
            if (number != 0) {
                returnCoins.put(coin, number);
            }
            userMoney -= coin*number;
        }
        return returnCoins;
    }
}
