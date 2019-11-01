package Task23;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;

public class MyBasket implements Basket{

    private static final List<String> basketList = new ArrayList<>();
    private String product;
    private int quantity;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override // добавить продукт
    public void addProduct(String product, int quantity) {
        basketList.add(product);
        basketList.add(String.valueOf(quantity));
        System.out.println("В корзину добавлено: " + product + " кол-во: " + quantity);

    }

    @Override // удалить продукт
    public void removeProduct(String product) {
        basketList.remove(product);
        basketList.remove(quantity);
    }

    @Override // обновить кол-во продукта
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override // очистить корзину
    public void clear() {
        basketList.removeAll(basketList);
    }

    @Override // какие продукты в корзине
    public List<String> getProducts() {
        System.out.println(basketList); // выводить продукт и кол-во. Нужно вывести только продукт
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }

}
