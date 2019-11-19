package task29;


import java.util.Objects;

public class Person {
    private int age;
    private String surname;
    private String gender;

    public Person(int age, String surname, String gender) {
        this.age = age;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getSurname() + " : " + getAge() + " : " + getGender();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, surname, gender);
    }

    private int getAge() {
        return age;
    }

    private String getSurname() {
        return surname;
    }

    private String getGender() {
        return gender;
    }
}
