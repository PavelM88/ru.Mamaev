package task14;

public enum DrinkList1 {
    CAPPUCCINO(120,"RUB"),
    ESPRESSO(100,"RUB" ),
    AMERICANO(110,"RUB"),
    LATTE(130,"RUB");
    private int price;
    private String currency;
    DrinkList1(int price, String currency) {
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
