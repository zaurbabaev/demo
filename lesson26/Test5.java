package lesson26;

public class Test5 {
   Test5(){
      System.out.println("Konstruktor");
   }
   String s1;

   { s1="ok";
      System.out.println("init block");
      int a=5;
      System.out.println(a);
   }



   public static void main(String[] args) {
      Test5 t=new Test5();
      Test5 t2=new Test5();
      System.out.println(t.s1);


   }
}
