import java.io.*;
class base
{
    int a=10;
   public int disp()
      {
        System.out.println("the base value is"+a);
return 0;
      }
}
class derived extends base
{
    int a=20;
   public int disp()
   {
      System.out.println("the derived value is"+a);
      System.out.println("the base value is "+super.a);
      System.out.println("the base method is"+super.disp());
	return 0;
   }
}

class SuperDemo
{
  public static void main(String args[])
   {
   derived d=new derived();
     d.disp();
   }
}