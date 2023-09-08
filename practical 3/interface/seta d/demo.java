import java.util.Scanner;
interface cube
{
     public int cube();
}
class tofindcube implements cube
{
   int num;
  tofindcube(int num)
{
  this.num=num;
}  

 public int cube()
{
   int cube=num*num*num;
   return cube;
}
}
class demo
{
   public static void main(String []args)
{
	 Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
	 int num=sc.nextInt(); 
	 tofindcube cu=new tofindcube(num);
         System.out.println("cube of "+num+" is "+cu.cube());
}
}
