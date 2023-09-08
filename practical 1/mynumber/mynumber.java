class mynumber
{
   private int num;
   mynumber()
{
    num=0;
}
   mynumber(int num)
{
    this.num=num;
}
boolean isZero()
{
  if(num==0) return true;else return  false;
}
boolean isNegative()
{
  if(num<0) return true;else return  false;
}
boolean isPositive()
{
  if(num>0) return true;else return  false;
}
boolean isOdd()
{
  if(num%2!=0) return true;else return  false;
}
boolean isEven()
{
  if(num%2==0) return true;else return  false;
}
public static void main(String []args)
{
  if(args.length==1)
{
  mynumber nobj=new mynumber(Integer.parseInt(args[0]));
  System.out.println(args[0]+" is negative "+nobj.isNegative());
 System.out.println(args[0]+" is positive "+nobj.isPositive());
 System.out.println(args[0]+" is zero "+nobj.isZero());
 System.out.println(args[0]+" is even number "+nobj.isEven());
 System.out.println(args[0]+" is odd number "+nobj.isOdd());
}
else 
System.out.println("invalid number of argument");
}
}
