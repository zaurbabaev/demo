package lesson26;

public class Test7 {
   int a = 3;

   Test7() {
      System.out.println("konstructor");
      a = 4;
   }

   {
      System.out.println("block");
      a = 5;
   }

   public static void main(String[] args) {
      Test7 t = new Test7();
      System.out.println(t.a);
   }
}

class A {

   static final int a;
   int b = 10;

   static {
      a = 12;
   }
}

class B {
   static int a;
   static final int b = 12;
   static final int c;
   static final double d;
   static final long l;

   static {

      c = 45;
      d = 12.4;
      l = 50;

   }

   public static void main(String[] args) {
      B b = new B();
      System.out.println(B.l);
   }
}

class C {
   String s = "ok";

   {
      System.out.println(s);
   }

   static int i = 0;

   static {
      System.out.println(i);
   }

   C() {
      System.out.println("eto konstruktor");
   }

   static {
      i += 1;
      System.out.println(i);
   }

   public static void main(String[] args) {
      C c = new C();

   }
}

class D {
   String s = "ok";

   {
      System.out.println(s);
   }

   static int i = 0;

   static {
      System.out.println(i);
   }

   {
      i += 1;
      System.out.println(i);
   }

   D() {
      System.out.println("eto konstructor");
   }

   public static void main(String[] args) {
      System.out.println("privet vsem");
      D d = new D();


   }


}


