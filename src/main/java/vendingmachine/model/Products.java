package vendingmachine.model;

import java.util.HashMap;

public class Products {
    private HashMap<String, Product> products = new HashMap<>();
    private int minPrice = Integer.MAX_VALUE;

    public void addProduct(String name, int price, int stock) {
        Product newProduct = new Product(name, price, stock);
        products.put(name, newProduct);
        minPrice = Math.min(minPrice, price);
    }

    public void buyProduct(String productName) {
        //예외처리 (상품명 존재)
        products.get(productName).reduceStock();
    }

    public boolean canBuyProduct(int userMoney) {
        if (userMoney < minPrice) {
            return false;
        }

        for (Product product : products.values()) {
            if (product.getStock() > 0 && product.getPrice() < userMoney) {
                return true;
            }
        }
        return true;
    }
}
