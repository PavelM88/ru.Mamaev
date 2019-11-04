package task23;

public class TestMyBasket {
    public static void main(String[] args) {
//        List<MyBasket> list = new ArrayList<>();
//        list.add(new MyBasket());
//        for (MyBasket basket: list) {
//            basket.addProduct("Кофе", 2);
//            basket.getProducts();
//            basket.removeProduct("Кофе");
//            basket.getProducts();
//        }
        MyBasket myBasket = new MyBasket();
        myBasket.addProduct("Чай",5);
        myBasket.getProducts();
        myBasket.removeProduct("Чай");
    }
}
