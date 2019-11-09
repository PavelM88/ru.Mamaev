package task25_2;

public class TestBasket {
    public static void main(String[] args) {
        MyBasketMap myBasketMap = new MyBasketMap();
        myBasketMap.addProduct("milk", 3);
        myBasketMap.addProduct("apple",5);
        myBasketMap.getProductQuantity("milk");
        myBasketMap.updateProductQuantity("milk", 10);
        myBasketMap.getProducts();
    }
}
