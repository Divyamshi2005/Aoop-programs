import java.io.*;                                
 class ovloading                      
{
  void calculate(int a,int b)
  {
  System.out.println(a*b);
  }
  void calculate(long a,long b,long c)
  {
  System.out.println(a*b*c);
  }
}
class methodovl
{
 public static void main(String args[])
 {
   ovloading o=new ovloading();
       o.calculate(987634521,28287946,12867246);
       o.calculate(21,20);
}
}

