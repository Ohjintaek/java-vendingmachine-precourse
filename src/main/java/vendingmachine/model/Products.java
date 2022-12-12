package vendingmachine.model;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> products = new ArrayList<>();

    public void makeProduct(String name, int price, int stock) {
        Product newProduct = new Product(name, price, stock);
        products.add(newProduct);
    }
}
