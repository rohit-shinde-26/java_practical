import java.util.Scanner;
class sort
{
  public static void main(String [] args )
{
   Scanner input=new Scanner(System.in);
  System.out.println("how many elements you have to insert in array");
  int n =input.nextInt();
  int a[]=new int[n];
 System.out.println("enter the array element");
  for(int i=0;i<n;i++)
{
   a[i]=input.nextInt();
}
    System.out.println("unsorted array is "); 
  for(int i=0;i<n;i++)
{
    System.out.println(a[i]);
}
   for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
{
     if(a[i]>a[j])
{
     int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
}
}
}
   System.out.println("assending array is");
   for(int i=0;i<n;i++)
{
   System.out.println(a[i]);
}
}
}
