package lesson26;

public class Test4 {

   void abc(String s) {
      System.out.println("A");
   }

   void abc(String... s) {
      System.out.println("b");
   }

   void abc(Object s) {
      System.out.println("C");
   }

   void abc(String s1, String s2) {
      System.out.println("D");
   }

   void def(Long l) { System.out.println("long");}

   void def(Long... a) {System.out.println("varargs");}

   void def(long a) {System.out.println("long");}
   void def(long...a ){System.out.println("long varargs");}

   void def(Integer i) {System.out.println("integer");}

   void def(Object o) {System.out.println("Object");}

   public static void main(String[] args) {
      Test4 t = new Test4();
      t.abc("ok", ">>>");
      t.def(50);

   }
}
