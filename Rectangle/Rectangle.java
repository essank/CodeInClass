public class Rectangle
{
   //instance variables
   private double length;
   private double width;
   
   // no-argument constractor 
   public Rectangle()
   {
      length = 0;
      width = 0;
   }
   
   //argument constractor
   public Rectangle(double l, double w)
   {
      length = l;
      width = w;
   }
   
   //setters
   public void setLength(double l)
   {
      length = l;
   }
   
   public void setWidth(double w)
   {
      width = w;
   }
   
   //getters
   public double getLength()
   {
      return length;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   //gets the area 
   public double getArea()
   {
      double area = length * width;
      return area;
   }
}