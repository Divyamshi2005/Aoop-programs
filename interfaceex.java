import java.io.*;

interface Printer
{
public abstract void Connect();
public abstract void print();
public abstract void Disconnect();
}

class Hp implements Printer
   {
     public void Connect()
    {
      System.out.println("connected to hp");
    }
    public void print()
{
System.out.println("printing doc with xerox printer");
}
    public void Disconnect()
    {
      System.out.println("connected to hp");
    }
  }
class zerox implements Printer
 {
   public void Connect()
    {
      System.out.println("connected to zerox");
    }
    public void print()
{
System.out.println("printing doc with xerox printer");
}
    public void Disconnect()
    {
      System.out.println("connected to zerox");
    }
  }
class canon implements Printer
 {
  public void Connect()
    {
      System.out.println("connecedt to canon");
    }
   public void print()
{
System.out.println("printing doc with xerox printer");
}
    public void Disconnect()
    {
      System.out.println("connected to canon");
    }
  }
class interfaceex
{
  public static void main(String args[])
   {
     Hp h=new Hp();
     h.Connect();
     h.print();
     h.Disconnect();
     zerox z=new zerox();
     z.Connect();
     z.print();
     z.Disconnect();
     canon c=new canon();
     c.Connect();
     c.print();
     c.Disconnect();
   }
}
