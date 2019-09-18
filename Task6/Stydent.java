package Task6;

public class Stydent {
    public static void main(String[] args) {
        AveregeRating studentPetr = new AveregeRating(4,4,4);
        Person petr = new Person("Petr", "Petrov", 20, 3,studentPetr);
        petr.displayInfo();
        studentPetr.AveregeMarkInfo();
        AveregeRating studentIvan = new AveregeRating(4,3,4);
        Person ivan = new Person("Ivan", "Ivanov",19,3,studentIvan);
        ivan.displayInfo();
        studentIvan.AveregeMarkInfo();
        AveregeRating studentNik = new AveregeRating(4,5,3);
        Person nik = new Person("Nikolai", "Nikolaev", 22, 4,studentNik);
        nik.displayInfo();
        studentNik.AveregeMarkInfo();


    }
}
