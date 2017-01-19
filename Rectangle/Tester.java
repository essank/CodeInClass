public class Tester
{
   public static void main (String[] args)
   {
      //create an object
      Rectangle rec1 = new Rectangle(15, 20);
      
      //check values of length and width
      System.out.println("Length: " + rec1.getLength());
      System.out.println("Width: " + rec1.getWidth());
      System.out.println("Area: " + rec1.getArea());
   }
}