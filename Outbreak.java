public class Outbreak
{
   public static void main (String args[])
   {
      //Declare a Hurricane object named kat
      Hurricane kat = new Hurricane();
   
      //set the name to "Katrina"
      kat.setName("Katrina");
   
      //set the year to 2005
      kat.setYear(2005);
   
      // set the category to 3
      kat.setCategory(3);
   
      // Use the getter methods to complete the statement below:
      System.out.println("Hurricane " + kat.getName() + " was a category " + kat.getCategory() + " storm that hit in " +
               kat.getYear() + ".");
   
      //Sure would be nice to have a method that would print all that stuff at once...
   }
}