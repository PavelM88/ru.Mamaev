package Task9.Person;

public abstract class PersonClass implements ToRun, ToSwim {
   String name;

    public String getName() {
        return name;
    }

    @Override
    public void toRunInfo() {
        System.out.println(name + " бегает");
    }

    @Override
    public void toSwimInfo() {
        System.out.println(name + " плавает");
    }
}
