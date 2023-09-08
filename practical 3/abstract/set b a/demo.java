import java.util.Scanner;
class order
{
   int id;
   String description;
 void accept()
{
     Scanner sc=new Scanner(System.in);
    System.out.println("enter order id");
     id=sc.nextInt();
     sc.nextLine();
    System.out.println("enter  order description");
     description=sc.nextLine(); 
}
   void display()
{
    System.out.println(id+"\t"+description);
}
}
 class purchase_order extends order
{
     String cust_name;
void accept()
{
     Scanner sc=new Scanner(System.in);
    super.accept();
    System.out.println("enter customer name:");
     cust_name=sc.nextLine(); 
}
   void display()
{   super.display();
    System.out.println(cust_name);
}
}
 class sales_order extends order
{
     String vendor_name;
void accept()
{
     Scanner sc=new Scanner(System.in);
    super.accept();
    System.out.println("enter vender name:");
     vendor_name=sc.nextLine(); 
}
   void display()
{   super.display();
    System.out.println(vendor_name);
}
}
class demo
{
  public static void main(String[] args)
{
    purchase_order p[]=new purchase_order[3];
  for(int i=0;i<3;i++)
{
    p[i]=new purchase_order();
    p[i].accept();
}
 for(int i=0;i<3;i++)
{
    p[i].display();
}
  sales_order s[]=new sales_order[3];
  for(int i=0;i<3;i++)
{
    s[i]=new sales_order();
     s[i].accept();
    
}
 for(int i=0;i<3;i++)
{
    s[i].display();
}
}
}
