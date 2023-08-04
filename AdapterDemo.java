class Volt
{
   private int volt;
   public Volt(int v)
   {
     this.volt=v;
   }
   
   public int getVolt()
   {
     return volt;
   }
}


class Socket
 {
    public Volt getVolt()
     {
       return new Volt(120);
      }
 }


interface SocketAdapter
  {
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
  }


class SocketClassAdapter extends Socket implements SocketAdapter 
{

  public Volt get120Volt()
     {
       return getVolt();
     }
  public Volt get12Volt()
  {
     Volt v=getVolt();
     return convertVolt(v,10);
  }
 public  Volt get3Volt()
  {
     Volt v=getVolt();
     return convertVolt(v,40);
  }
   private Volt convertVolt(Volt v, int i)
    {
       return new Volt(v.getVolt()/i);
    }
}
class AdapterDemo
{
  public static void main(String args[])
   {
     SocketClassAdapter s1=new SocketClassAdapter();
      v120=s1.getVolt();
      v12=s1.get3Volt(v.getVolt,10);
   }
}
  