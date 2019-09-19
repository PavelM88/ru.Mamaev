package Task6;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int courseNumber;
    private AveregeRating studentRating;
    Person (String name, String surname, int age, int courseNumber, AveregeRating studentRating) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.courseNumber = courseNumber;
        this.studentRating = studentRating;

        }

    public AveregeRating getStudentRating() {

        return studentRating;
    }

    public void setStudentRating(AveregeRating studentRating) {

        this.studentRating = studentRating;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    void displayInfo() {

        System.out.println(name + " " + surname  + " Возраст " + age);

    }
}
