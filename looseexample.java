interface I
{
public abstract void m1();
}
class A implements I
{
  public void m1()
  {
   System.out.println("inside A class m1 method");
  }
}
class B implements I
{
  public void m1()
   {                                                             
     System.out.println("inside B class m1 method");
   }
}
class C implements I
{
  public void m1()
   {
    System.out.println("inside C class m1 method");
   }
}
class looseexample
{
 public static void main(String args[])
  {
    I obj=new A();
      obj.m1();
     obj=new B();
      obj.m1();
    obj=new C();
      obj.m1();
 }
}