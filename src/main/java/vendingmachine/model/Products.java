package vendingmachine.model;

import java.util.HashMap;

public class Products {
    private HashMap<String, Product> products = new HashMap<>();
    private int minPrice = Integer.MAX_VALUE;

    public void addProduct(String product) {
        String[] productDetail = product.replaceAll("[\\[\\]]","").split(",");
        String name = productDetail[0];
        int price = Integer.parseInt(productDetail[1]);
        int stock = Integer.parseInt(productDetail[2]);

        Validator.isDuplicateProduct(name, products.keySet());
        Validator.isOverHundred(price);

        Product newProduct = new Product(name, price, stock);
        products.put(name, newProduct);
        minPrice = Math.min(minPrice, price);
    }

    public int buyProduct(String productName) {
        if (!products.containsKey(productName)) {
            throw new IllegalArgumentException(Validator.error + "자판기에 해당 상품이 존재하지 않습니다.");
        }
        Product wantedProduct = products.get(productName);
        wantedProduct.reduceStock();

        return wantedProduct.getPrice();
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
