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

    @Override
    public String toString() {
        return getSurname() + " : " + getAge() + " : " + getGender();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getSurname().hashCode();
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
