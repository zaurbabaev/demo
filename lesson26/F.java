package lesson26;

public class F {
   static {abc(2);}

   static void abc(int a) {System.out.println(a);}

   F() {abc(5);}

   static {abc(4);}

   {abc(6);}

   static {new F();}

   {abc(8);}

   public static void main(String[] args) {

   }
}
