package vendingmachine.model;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> products = new ArrayList<>();
    private List<String> productsName = new ArrayList<>();

    public void addProduct(String name, int price, int stock) {
        Product newProduct = new Product(name, price, stock);
        products.add(newProduct);
        productsName.add(name);
    }
}
