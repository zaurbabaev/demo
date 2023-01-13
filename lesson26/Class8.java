package lesson26;

public class Class8 {
   public static void main(String[] args) {
      Leon l=new Leon();

   }

}

class Animal {
   Animal() {
      System.out.println("Constructor of Animal");
   }

   static {
      System.out.println("Static init of Animal");
   }

   {
      System.out.println("Non static init of Animal");
   }
}

class Mammal extends Animal {
   Mammal() {
      System.out.println("Constructor of Mammal");
   }

   static {
      System.out.println("Static init of Mammal");
   }

   {
      System.out.println("Non static init of Mammal");
   }
}

class Leon extends Mammal {
   Leon() {
      System.out.println("Constructor of Lion");
   }

   static {
      System.out.println("Static init of Lion");
   }

   {
      System.out.println("Non static init of Lion");
   }

   public static void main(String[] args) {
      Mammal l=new Mammal();
   }
}
