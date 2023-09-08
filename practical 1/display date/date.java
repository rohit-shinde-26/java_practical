import java.util.Date;
import java.text.SimpleDateFormat;
class date
{
    public static void main(String []args)
{
   Date d= new Date();
  System.out.println("current  date is "+d);
   SimpleDateFormat sdf=new SimpleDateFormat("MMMM/dd/yy");
   System.out.println("current  date is "+sdf.format(d));
   sdf=new SimpleDateFormat("EEEE  MMMM  dd  yyyy");
   System.out.println("current  date is "+sdf.format(d));
   sdf=new SimpleDateFormat("h:m:s a");
  System.out.println("current  time is "+sdf.format(d));
  sdf=new SimpleDateFormat("M");
   System.out.println("current  month is "+sdf.format(d));
  sdf=new SimpleDateFormat("Y");
   System.out.println("current  year is "+sdf.format(d));
 sdf=new SimpleDateFormat("w");
   System.out.println("current  weaks is "+sdf.format(d));
 sdf=new SimpleDateFormat("dd/MM/yy h:m:s a ");
   System.out.println("current  date & time is "+sdf.format(d));
 sdf=new SimpleDateFormat(" EEEE DD MMMM h:m:s a yyyy ");
   System.out.println("current  date & time is "+sdf.format(d));
}
}
