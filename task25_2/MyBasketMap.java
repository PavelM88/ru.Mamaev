package task25_2;

import java.util.*;

public class MyBasketMap implements BasketMap{

   private static final Map<String, Integer> basket = new HashMap<>();

    @Override // добавить продукт
    public void addProduct(String product, int quantity) {
        basket.put(product, quantity);
        System.out.println("В корзину добавили: " + product + " кол-во: " + quantity);
    }

    @Override // удалить продукт
    public void removeProduct(String product) {
        basket.entrySet().removeIf(entry -> entry.getKey().equals(product));
    }

    @Override // обновить кол-во продукта
    public void updateProductQuantity(String product, int quantity) {
        basket.put(product, quantity);

    }

    @Override // очистить корзину
    public void clear() {
        basket.clear();
    }

    @Override // какие продукты в корзине
    public List<String> getProducts() {
        Set<Map.Entry<String, Integer>> set = basket.entrySet();
        for (Map.Entry<String, Integer> map : set) {
            System.out.println("В корзине: " + map.getKey() + " кол-во: " + map.getValue());
        }

//        for (String s : basket.keySet()) {
//            System.out.println("Продукты в корзине: " + s);
//        }
        return null;
    }

    @Override // кол-во продукта в корзине
    public int getProductQuantity(String product) {
        Set<Map.Entry<String, Integer>> set = basket.entrySet();
        for (Map.Entry<String, Integer> integerEntry : set) {
            if (product.equals(integerEntry.getKey())) {
                System.out.println(" Кол-во: " + integerEntry.getValue());
            }
        }
        return 0;
    }
}
