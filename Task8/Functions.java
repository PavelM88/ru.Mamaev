package Task8;

class Functions {
   private static double x;
   private static double y;

   Functions(double x, double y) {
       Functions.x = x;
       Functions.y = y;
   }

   static double addition() {
       return x + y;
   }

   static double subtraction() {
       return x - y;
   }

   static double multiplication() {
       return x * y;
   }

   static double division() {
       return x / y;
   }
   static double percent() {
       double a = x / y;
       return 100 / a;
   }
}
