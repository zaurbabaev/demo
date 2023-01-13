package lesson26;

public class Test8 {
   void abc(short s) {
      System.out.println("byte");
   }

   void abc(int i) {
      System.out.println("int");
   }

   void abc(float f) {
      System.out.println("float");
   }

   void abc(Object o) {
      System.out.println("Object");
   }

   public static void main(String[] args) {
      Test8 t = new Test8();
      char c = 55;
      t.abc(c);
      t.abc(false);
      t.abc(3.14);
   }
}
