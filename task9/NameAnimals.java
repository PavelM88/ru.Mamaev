package task9;

public class NameAnimals {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.getName();

        Cat cat = new Cat();
        cat.getName();

        Run run = new Dog();
        run.runInfo();

        Run runCat = new Cat();
        runCat.runInfo();

        Swim swimDog = new Dog();
        swimDog.swimInfo();

        Swim swimCat = new Cat();
        swimCat.swimInfo();

    }
}
