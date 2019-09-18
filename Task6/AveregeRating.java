package Task6;

public class AveregeRating {
    private int matematica;
    private int fizika;
    private int ekonomika;
    AveregeRating (int matematica, int fizika,int ekonomika) {
        this.matematica = matematica;
        this.fizika = fizika;
        this.ekonomika = ekonomika;

    }

    public AveregeRating() {
    }

    void AveregeMarkInfo() {
        double averegeMark =(double) (matematica + fizika + ekonomika) / 3;
        System.out.println("Средняя оценка " + averegeMark);

    }
}
