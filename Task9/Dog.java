package Task9;

public class Dog extends Animal implements Run, Swim {
    @Override
    public void getName() {
        System.out.println("Собака по кличке Шарик");
    }

    @Override
    public void runInfo() {
        System.out.println("Шарик бегает");
    }

    @Override
    public void swimInfo() {
        System.out.println("Шарик любит плавать");
    }
}
