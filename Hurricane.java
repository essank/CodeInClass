//Simple Hurricane class
public class Hurricane
{
   private String name;       
   private int category;
   private int year;

   public Hurricane()
   {
      name = "";
      category = 0;
      year = 0;
   }
   public void setName(String newName)
   {
      name = newName;
   }

   public void setCategory(int newNumber)
   {
      category = newNumber;
   }

   public void setYear(int y)
   {
      year = y;
   }

   public String getName()
   {
      return name;
   }

   public int getCategory()
   {
      return category;
   }

   public int getYear()
   {
      return year;
   }

   /*
   public String toString()
   {
      return "Hurricane " + name + " hit in " + year + " with a Saffur-Simpson rating of " + category;
   }
   */
} 