package vendingmachine.view;

import java.util.HashMap;

public class OutputView {
    public void showVendingMachineMoney(HashMap<Integer, Integer> coins) {
        System.out.println("자판기가 보유한 동전");
        for (int coin : coins.keySet()) {
            System.out.println(String.format("%d원 - %d개", coin, coins.get(coin)));
        }
        System.out.println();
    }
}
