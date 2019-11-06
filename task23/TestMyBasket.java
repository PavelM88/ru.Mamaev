package task23;


public class TestMyBasket {
    public static void main(String[] args) {
        MyBasket myBasket = new MyBasket();
        myBasket.addProduct("Чай",5);
        myBasket.addProduct("Кофе", 3);
        myBasket.getProducts();
        myBasket.updateProductQuantity("Чай", 8);
        myBasket.getProducts();
        myBasket.getProductQuantity("Чай");

    }
}
