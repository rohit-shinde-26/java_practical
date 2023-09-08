import java.util.Scanner;
interface opperation
{
  public double area();
  public  double volume();
   static double pi=3.142;
}
   class cylinder implements opperation
{
   double height;
   double radius;

      cylinder(double height,double radius)
{   
   this.height=height;
   this.radius=radius;
}
   public double area()
{
    double a=(2*pi*radius*height)+(2*pi*radius*radius);
      return a;
}
  public double volume()
{
    double v=pi*radius*radius*height;
    return v;
}
}
class demo
{
   public static void main(String []args)
{      Scanner sc=new Scanner(System.in);
        System.out.println("enter the height ");
        double height=sc.nextDouble();
      System.out.println("enter the radius ");
       double radius=sc.nextDouble();
      cylinder cy=new cylinder(height,radius);
        System.out.println("area of cylinder is "+ cy.area());
        System.out.println("volume of cylinder is "+  cy.volume());
      
}
}
