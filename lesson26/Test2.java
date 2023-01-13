package lesson26;

import java.util.ArrayList;

public class Test2 {
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(5);
      Long l = 50l;
      int a = list.get(0);
      System.out.println(a);
      Integer i = new Integer(53);
      int b = i;
      System.out.println(i);
      System.out.println(b);
      Number n = new Integer(15);
      int c = (Integer) n;
      String s1 = "59";
      Integer is = Integer.parseInt(s1);
      System.out.println(is);
      String s2 = "false";
      boolean b1 = Boolean.parseBoolean(s2);
      System.out.println(b1);
      String s3 = "3.14";
      Double d1 = Double.parseDouble(s3);
      Double d2 = Double.valueOf(s3);
      System.out.println(d2);
      Byte b3 = new Byte((byte) 5);
      Byte b4 = Byte.valueOf((byte) 5);


   }
}
