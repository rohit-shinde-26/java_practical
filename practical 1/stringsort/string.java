import java.util.Scanner;
class sort
{
  public static void main(String [] args )
{
   Scanner input=new Scanner(System.in);
  System.out.println("how many string  you have to insert in array");
  int n =input.nextInt();
  String a[]=new String[n];
 input.nextLine();
  for(int i=0;i<n;i++)
{  System.out.println("enter a srings "+(i+1)+" : ");
   a[i]=input.nextLine();
}
    System.out.println("string is "); 
  for(int i=0;i<n;i++)
{
    System.out.println(a[i]);
}
   for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
{
     if(a[i].compareTo(a[j])< 0)
{
     String temp=a[i];
   a[i]=a[j];
    a[j]=temp;
}
}
}
   System.out.println("desending string is ");
   for(int i=0;i<n;i++)
{
   System.out.println(a[i]);
}
}
}
