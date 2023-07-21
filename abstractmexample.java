import java.lang.*;
abstract class Shape
{
  abstract public void Calculate(int x);
}
class square extends Shape
  {
   public void Calculate(int x)
     {
        System.out.println(x*x);
     }
  }
class squareroot extends Shape
  {
    public void Calculate(int x)
     {
       System.out.println(Math.sqrt(x));
     }
  }
class cube extends Shape
  {
    public void Calculate(int x)
     {
       System.out.println(x*x*x);
     }
  }
class abstractmexample
{
 public static void main(String args[])
   {
    square s=new square();
     s.Calculate(5);
    squareroot rt=new squareroot();
     rt.Calculate(16);
    cube c=new cube();
     c.Calculate(6);
    }
}
