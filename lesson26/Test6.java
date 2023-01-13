package lesson26;

public class Test6 {
   {
      System.out.println("eto init block 3");
   }
   Test6(){
      System.out.println("eto konstruktor 1");
   }
   Test6(int a){
      this();
      System.out.println("eto kostruktor 2");
   }
   {
      System.out.println("Eto init block 1");
   }
   static{
      System.out.println("eto STATIC block 1");
   }
   {
      System.out.println("Eto init block 2");
   }

   static{
      System.out.println("Eto STATIC block 2");
   }

   public static void main(String[] args) {
      Test6 t=new Test6();
      Test6 t1=new Test6();

   }
}
