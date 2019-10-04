package Task13;

public enum Food {
    CARROT("Морковка"),
    APPLE("Яблоко"),
    PORRIDGE("Каша"),
    ORANGE("Апельсин"),
    SOUP("Суп"),
    BANANA("Банан");
    public String name;
    Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
