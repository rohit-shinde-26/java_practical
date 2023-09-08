import java.util.Scanner;
class demo
{
   public static void main(String args[])
  {
 do 
{    Scanner input= new Scanner(System.in);
       

          System.out.println("1:volume of cylinder");  
          System.out.println("2:find the facturial of given number");
          System.out.println("3:check number is armstron or not");
          System.out.println("4:exit");
          System.out.println("enter your choice");
          int choice=input.nextInt();

  switch(choice)
{
    case 1:
          float pi= 3.14f;
            System.out.println("enter the value of radius ");
          float r=input.nextFloat();
              System.out.println("enter the value of height  ");
          float h=input.nextFloat();
          float v= pi*r*r*h;
            System.out.println("volume of the cylinder is "+ v);
       break;
    case 2:
            System.out.println("enter the number");
            int num=input.nextInt();
            int fact=1;
           for( int i=1;i<=num;i++)
           {
              fact=fact * i;
            }
           System.out.println("factor of given number is "+ fact);
       break;
    case 3:
            System.out.println("enter a number");
           int n=input.nextInt();
           int m=n,f,sum=0;
          while(n>0)
      {
          f=n%10;
          sum=sum+f*f*f;
          n=n/10;
         }
     if(sum==m)
      System.out.println("is armstrom number");
     else 
        System.out.println("is not armstrom number");
   break;
    case 4:
          System.exit(0);
}
}while(true);
}
}
