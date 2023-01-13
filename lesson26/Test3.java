package lesson26;

public class Test3 {
   void abc(int i) {
      System.out.println("int");
   }

   void abc(byte b) {
      System.out.println("byte");
   }

   void abc(long l) {
      System.out.println("long");
   }

   void abc(float f) {
      System.out.println("float");
   }

   void def(int a, int b) {
      System.out.println("Hello1");
   }

   void def(long l, long b) {
      System.out.println("Hello2");
   }

   void def(Integer i1, Integer i2) {
      System.out.println("Hello3");
   }

   void def(int... a) {
      System.out.println("Hello4");
   }

   void gdi(Object o) {
      System.out.println("Object");
   }

   void gdi(String s) {
      System.out.println("String");
   }

   public static void main(String[] args) {
      Test3 t = new Test3();
      t.abc(5);
      t.def(5, 5);
      t.gdi(new StringBuilder(""));
   }
}
