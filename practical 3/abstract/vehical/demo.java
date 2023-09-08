import java.util.Scanner;
class vehical
{
   String company;
   double price;
   vehical()
{
    this.company=company;
    this.price=price;

}
 void accept()
{
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the name of company");
     company=sc.nextLine();
    System.out.println("enter the prise of vehical");
     price=sc.nextDouble(); 
}
}
class LightMoterVehical extends vehical
{
   double milage;
   LightMoterVehical()
{
   super();
   this.milage=milage;
}
void accept()
{  super.accept();
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the milage of vehical");
     milage=sc.nextDouble();
}
   void display()
{
    System.out.println(company+"\t"+price+"\t"+milage);
}
}
class HeavyMoterVehical extends vehical
{
    double capacity_in_tones;
   HeavyMoterVehical()
{
   super();
   this.capacity_in_tones=capacity_in_tones;
}
void accept()
{   super.accept();
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the capacity_in_tones of vehical");
     capacity_in_tones=sc.nextDouble();
}
   void display()
{
    System.out.println(company+"\t"+price+"\t"+capacity_in_tones);
}
}
class demo
{
  public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("how many vehicals you have to insert");
  int n=sc.nextInt();
  System.out.println("enter your vehical type ");
   System.out.println("1:Light_vehical \t 2:heavy_vehical");
   
  int s=sc.nextInt();
 if(s==1)
  {
LightMoterVehical lv[]=new LightMoterVehical[n];
for(int i=0;i<n;i++)
{  System.out.println("enter the details of "+(i+1)+" vehical");
    lv[i]=new LightMoterVehical();
    lv[i].accept();
}
 for(int i=0;i<n;i++)
{ 
   System.out.println("company\tprice\tmilage");
  lv[i].display();
}
}
else
{
   HeavyMoterVehical hv[]=new HeavyMoterVehical[n];
  for(int i=0;i<n;i++)
{  System.out.println("enter the details of "+(i+1)+" vehical");
    hv[i]=new HeavyMoterVehical();
    hv[i].accept();
}
 for(int i=0;i<n;i++)
{ 
   System.out.println("company\tprice\tcapacity_in_tones");
  hv[i].display();
}
}
}
}
