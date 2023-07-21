import java.io.*;
class base
{
 protected int a=10;
  public void disp()
  {
   System.out.println("the base value is"+a);
}
}
class derived extends base
{
private int b=20;
public void display()
 {
System.out.println("the derived value is"+b);
}
}

class inherit
{
public static void main(String args[])
 {
   derived d=new derived();
     d.disp();
     d.display();
}
}