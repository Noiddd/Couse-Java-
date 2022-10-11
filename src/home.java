
class Home {
    public static void main(String[] args) {
     try {
         int a = 0;
         System.out.println("a = " + a);
         int b = 20 / a;
         System.out.println("b = " + b);
     } catch(ArithmeticException e) {
         System.out.println("DIVIDE ZERIO");
     } finally {
         System.out.println("FINA");
     }
    }
}
