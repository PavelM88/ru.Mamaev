package task29;


public class Person {
    private int age;
    private String surname;
    private String gender;

    public Person(int age, String surname, String gender) {
        this.age = age;
        this.surname = surname;
        this.gender = gender;
    }

    public String toString() {
        return getSurname() + " : " + getAge() + " : " + getGender();
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
