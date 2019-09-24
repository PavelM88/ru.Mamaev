package Task9.Person;

public abstract class PersonClass implements ToRun, ToSwim {
   String name;

    @Override
    public void toRunInfo() {
        System.out.println(name + " бегает");
    }

    @Override
    public void toSwimInfo() {
        System.out.println(name + " плавает");
    }
}
