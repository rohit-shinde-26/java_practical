import java.util.Scanner;
class demo
{
  public static void main(String args[])
{
   Scanner input = new Scanner(System.in);
  System.out.println("enter the length");  
 float l= input.nextFloat();
  System.out.println("enter the breath");  
   float b= input.nextFloat();
   float area= l*b;
   float parameter=2*(l+b);
   System.out.println("area is " + area);
  System.out.println("parameter is " + parameter);
}
}
