package scanner;

import java.util.Scanner;

public class Example
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      String name;
      
      System.out.println("what is your name: ");
      
      name = in.nextLine();
      
      int age;
      
      System.out.println("what is your age: ");
      
      age = in.nextInt();
      
      System.out.println("Hello " + name + " 10 years younger " + (age - 10));
   }
}
