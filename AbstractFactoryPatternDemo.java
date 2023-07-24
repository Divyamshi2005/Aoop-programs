interface Shape
{
  public void draw();
}

class Square implements Shape
{
  public void draw()
  {
   System.out.println("inside square draw method");
   }
}  

class Rectangle implements Shape
{
  public void draw()
  {
   System.out.println("inside rectangle draw method");
   }
}  
 
class RoundedSquare implements Shape
{
  public void draw()
  {
   System.out.println("inside Roundedsquare draw method");
   }
}  

class RoundedRectangle implements Shape
{
  public void draw()
  {
   System.out.println("inside RoundedRectnagle draw method");
   }
}  

abstract class AbstractFactory
 {
   public abstract Shape getShape(String shapeType);
 }

class ShapeFactory extends AbstractFactory
{
  public Shape getShape(String shapeType)
  {
  if(shapeType.equalsIgnoreCase("SQUARE"))
     return new Square();
  
  else if(shapeType.equalsIgnoreCase("RECTANGLE"))
     return new Rectangle();
return null;
  }
}

class RoundedShapeFactory extends AbstractFactory
{
   public Shape getShape(String shapeType)
   {  
  if(shapeType.equalsIgnoreCase("SQUARE"))
     return new RoundedSquare();
  
  else if(shapeType.equalsIgnoreCase("RECTANGLE"))
     return new RoundedRectangle();
return null;
   }
}

class FactoryProducer
{
   public static AbstractFactory getFactory(boolean b)
    {
     if(b)
     {
      return new RoundedShapeFactory();
     }
      else 
      {
       return new ShapeFactory();
      }
     }
}

class AbstractFactoryPatternDemo
{
  public static void main(String args[])
   {
     AbstractFactory af=FactoryProducer.getFactory(true);
     
     Shape s1=af.getShape("Square");
            s1.draw();
     Shape  s2=af.getShape("Rectangle");
            s2.draw();
     
    AbstractFactory af1=FactoryProducer.getFactory(false);
     
     Shape s3=af1.getShape("Square");
            s3.draw();
     Shape  s4=af1.getShape("Rectangle");
            s4.draw();

   }
}
     