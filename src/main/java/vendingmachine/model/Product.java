package vendingmachine.model;

public class Product {
    private final String name;
    private final int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void buyThisProduct() {
        stock--;
        //구매할 수 없는 경우 예외처리
    }
}
