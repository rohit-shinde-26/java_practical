class continent 
{
   String cont_name= "asia";
}
 class country extends continent
{
   String country_name="india";
}
class state extends  country
{
    String state="maharastra";
    String place="sangamner";
    void display()
{
        System.out.println(place);
        System.out.println(state);
        System.out.println(country_name);
        System.out.println(cont_name);
}
}
class demo
{
 public static void main(String []args)
{     
     state s=new state();
        s.display();
       // System.out.println(s.place);
        //System.out.println(s.state);
        //System.out.println(s.country_name);
        //System.out.println(s.cont_name);
}
}

