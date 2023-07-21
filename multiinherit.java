interface Father
{
 float ht = 5.5f;
  public abstract void height();
}
 interface Mother
{
 float ht = 5.0f;
  public abstract void height();
}

class Child implements Father,Mother
 {
   float ht;
   public void height()
   {
    ht=(Mother.ht+Father.ht)/2;
    System.out.println("the child height is "+ht);
   }
 }
class multiinherit
 {
  public static void main(String args[])
   {
    Child c=new Child();
     c.height();
   }
 }
