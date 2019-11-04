package task13;

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
    public static boolean isAllowedName(String name) {
        for (Food food : Food.values()) {
            if (food.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
