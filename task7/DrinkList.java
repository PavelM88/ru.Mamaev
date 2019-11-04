package task7;

public enum DrinkList {
    CAPPUCCINO(120,"RUB"),
    ESPRESSO(100,"RUB" ),
    AMERICANO(110,"RUB"),
    LATTE(130,"RUB");
    private int price;
    private String currency;
    DrinkList(int price, String currency) {
        this.price = price;
        this.currency = currency;

    }

    public int getPrice () {

        return price;
    }
    public String getCurrency () {

        return currency;
    }
}
