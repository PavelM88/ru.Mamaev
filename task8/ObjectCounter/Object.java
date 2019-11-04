package task8.ObjectCounter;

class Object {
    private static int count;
    Object () {
        count++;
    }
     void countInfo() {
         System.out.println("Количество объектов " + count);
     }
}
