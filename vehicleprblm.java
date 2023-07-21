import java.io.*;

interface Vehicle
{
  public abstract void changegear(int a);
  public abstract void speedup(int b);
}
class Car implements Vehicle
 {
  public void changegear(int a)
  {
   System.out.println("car gear:"+a);
  }
  public void speedup(int b)
  {
    System.out.println("car speed:"+b);
  }
}
class Bike implements Vehicle
{
   public void changegear(int a)
   {
     System.out.println("bike gear:"+a);
   }
   public void speedup(int b)
    {
      System.out.println("bike speed:"+b);
    }
}
class vehicleprblm
{
   public static void main(String args[])
{
    Car c = new Car();
       c.changegear(4);
       c.speedup(100);
    Bike b = new Bike();
       b.changegear(3);
       b.speedup(60);
}
}