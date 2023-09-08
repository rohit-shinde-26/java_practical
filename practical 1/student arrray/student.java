import java.util.Scanner;
class student
{
       int rollno;
       String name;
	void accept(int r1,String n1)
	{
		rollno=r1;
		name=n1;
	}
       void display()
	{
	        
		  System.out.println(rollno+"\t"+name);
	}
       public static void main(String args[] )
{
       Scanner input=new Scanner(System.in);
        System.out.println("how many students you have to insert");
       int n=input.nextInt();
       student s[]=new student[n];
    for(int i=0;i<n;i++)
      {
         System.out.println("enter the "+(i+1)+" students roll numbers");
         s[i]=new student();
         int rollno=input.nextInt();
          System.out.println("enter the name of student");
          input.nextLine();
          String name=input.nextLine();
         s[i].accept(rollno,name);
	}
      System.out.println("****student display****");
      System.out.println("rollno"+"\t"+"name");
   for(int i=0;i<n;i++)
  {
     s[i].display();
}
}
}
