package task23;

public class Product {
    private String product;
    private int quantity;

    Product(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    String getProduct() {
        return product;
    }

    int getQuantity() {
        return quantity;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
