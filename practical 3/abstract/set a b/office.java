import java.util.Scanner;
 abstract class staff
{    protected int member_id;
      String name;
   Scanner sc=new Scanner(System.in);
   staff()
{     System.out.println("enter the member id ");
     member_id=sc.nextInt();
      sc.nextLine();
 System.out.println("enter the member name ");
     name=sc.nextLine();
}
}
class officestaf extends staff
{    
   String department;
   officestaf()
{
    System.out.println("enter the department ");
    department=sc.nextLine();
}
  void display()
{   
  System.out.println(name+"\t"+member_id+"\t"+department);

}
}
class office
{
  public static void main(String []args)
{    Scanner sc=new Scanner(System.in);
     System.out.println("how many members you have to insert:");
       int n=sc.nextInt();
        officestaf os[]=new officestaf[n];
      for(int i=0;i<n;i++)
{
     os[i]=new officestaf();
      
}
     System.out.println("member details are: ");
    for(int i=0;i<n;i++)
{
  
    System.out.println("name \t member_id \t department");
      os[i].display();
}
}
}
