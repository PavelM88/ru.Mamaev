package task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Борис", 40));
        people.add(new Person("Александр", 35));
        people.add(new Person("Алиса", 30));
        people.add(new Person("Федор",28));
        people.add(new Person("Александр", 25));

        Collections.sort(people, new PersonSuperComparator());
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
