package lesson26;

import java.util.ArrayList;

public class Test1 {
   public static void main(String[] args) {
      Car car1 = new Car("red", "V4");
      Car car2 = new Car("red", "V4");
      Car car3 = new Car("yellow", "V6");
      System.out.println(car1.equals(car2));
      ArrayList<Car> list = new ArrayList<>();
      list.add(car1);
      list.add(car2);
      list.add(car3);
      Car car4 = new Car("yellow", "V6");
      System.out.println(list.contains(car4));
      System.out.println(list.toString());
      System.out.println(car1);


   }

}

class Car {
   String color;
   String engine;

   Car(String color, String engine) {
      this.color = color;
      this.engine = engine;
   }

   public boolean equlas(Object obj) {
      if (obj instanceof Car) {
         Car c = (Car) obj;
         return (this.color.equals(c.color) && this.engine.equals(c.engine));
      } else {
         return false;
      }
   }


   public String toString() {
      return "Mashina cvetom " + '\"' + color+ '\"' + " i s motorom " + '\"'+ engine+ '\"';
   }


}
