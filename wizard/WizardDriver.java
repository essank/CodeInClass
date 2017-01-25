package wizard;

public class WizardDriver
{
   public static void main (String[] args)
   {
     Wizard harry = new Wizard("Harry Potter","Griffyndor",1000);
     Wizard draco = new Wizard("Draco Malfoy","Slytherin",500);
     Wizard ron = new Wizard();
     
     ron.setName("Ron Weasley");
     
     ron.setHouse("Griffyndor");

     ron.setPower(800);
     
     harry.empower(100);
     
     System.out.println(draco.getPower());
     
   }
}