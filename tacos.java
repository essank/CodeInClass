import java.util.Scanner;

public class Example
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      String name;
      
      int tacos;
      
      double total = 0;
      
      double tax;
      
      double subTotal;
      
      System.out.print("What's your name? ");
      name = in.nextLine();
      
      System.out.print("How many tacos? ");
      tacos = in.nextInt();
      
      System.out.print("What is the tax? ");
      tax = in.nextInt();
      
      
      subTotal = tacos * .99;
      total = (tacos * .99) + subTotal;
      
      
      
      System.out.print("\nThanks " + name + " your subtotal is $" + subTotal + " for " + tacos +
                         " tacos." + " your tax is " + tax + " your total is " + total);
   }
}
