package task9.Person;

public class NewPerson2 extends PersonClass {
    private NewPerson2() {

    }

    public static void main(String[] args) {
        PersonClass person = new NewPerson();
        person.name = "Sam";
        person.toSwimInfo();
        PersonClass person2 = new NewPerson2();
        person2.name = "Nik";
        person2.toRunInfo();

    }

}
