public class Wizard
{
   private String name;
   private String house;
   private int power;
   
   public Wizard(String n, String h, int p)
   {
    name = n;
    house = h;
    power = p;
   }
   
   public Wizard()
   {
      name = "Anonymous";
      house = "Hufflepuff";
      power = 0;
   }
   
   public String getName()
   {
      return name;
   }
   
      public String getHouse()
   {
      return house;
   }
   
      public int getPower()
   {
      return power;
   }
   
   public void setName(String n)
   {
      name = n;
   }
   
   public void setHouse(String h)
   {
      house = h;
   }
   
   public void setPower(int p)
   {
      power = p;
   }
   
   public void empower(int increase)
   {
   power = power + increase;
   }
}