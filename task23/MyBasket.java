package task23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MyBasket implements Basket{

    private static final List<Product> basketList = new ArrayList<>();


    @Override // добавить продукт
    public void addProduct(String product, int quantity) {
        basketList.add(new Product(product, quantity));
        System.out.println("В корзину добавлено: [" + product + "] кол-во: [" + quantity + "]");

    }

    @Override // удалить продукт
    public void removeProduct(String product) {
        Iterator<Product> iterator = basketList.iterator();
        if (iterator.hasNext()) {
            if (iterator.next().getProduct().equals(product)) {
                iterator.remove();
            }
        }
    }

    @Override // обновить кол-во продукта
    public void updateProductQuantity(String product, int quantity) {
        for (Product prod: basketList) {
            if (prod.getProduct().equals(product)) {
                prod.setQuantity(quantity);
            }
        }
    }

    @Override // очистить корзину
    public void clear() {
        basketList.removeAll(basketList);
    }

    @Override // какие продукты в корзине
    public List<String> getProducts() {
        List<String> collect = basketList.stream().map(r -> r.getProduct()).collect(Collectors.toList());
        System.out.println(collect);
        return collect;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product prod : basketList) {
            if (prod.getProduct().equals(product)) {
                System.out.println("В корзине: " + product + " кол-во: " + prod.getQuantity());
            }
        }
        return 0;
    }

}
