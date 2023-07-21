interface Shape
{
  public void draw();
}

class Square implements Shape
  {
    public void draw()
     {
       System.out.println("sqaure inside draw method");
     }
  }
class Circle implements Shape
  {
    public void draw()
     {
       System.out.println("circle inside draw method");
     }
  }
class Rectangle implements Shape
  {
    public void draw()
     {
       System.out.println("rectangle inside draw method");
     }
  }

class ShapeFactory 
 {
   public Shape getShape(String ShapeType)
   {
       if(ShapeType==null)
         return null;
      if(ShapeType.equalsIgnoreCase("Square"))
        return new Square();
      if(ShapeType.equalsIgnoreCase("circle"))
        return new Circle();
      if(ShapeType.equalsIgnoreCase("rectangle"))
        return new Rectangle();
  return null;
   }
 }

class FactoryDemo
{
  public static void main(String args[])
   {
     ShapeFactory sf=new ShapeFactory();
     
      Shape s1=sf.getShape("Circle");
       s1.draw();
      Shape s2=sf.getShape("Square");
       s2.draw();
      Shape s3=sf.getShape("Rectangle");
       s3.draw();
    }
}



      