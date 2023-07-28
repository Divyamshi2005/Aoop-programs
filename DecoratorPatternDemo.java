interface Shape
  {
     public void draw();
  }


class Circle implements Shape
  {
	 public void draw()
   		{
   			 System.out.println("Shape cirle");
   		}
  }
class Rectangle implements Shape
  {
	public void draw()
  		{
  			 System.out.println("shape rectangle");
  		}
  }


 abstract class ShapeDecorator implements Shape
   {
   	 Shape decoratorShape;
   	public ShapeDecorator(Shape decoratorShape)
   	 {
    		 this.decoratorShape=decoratorShape; 
   	 }

   	public void draw()
   	{
   	 decoratorShape.draw();
        }
   }



class RedshapeDecorator extends ShapeDecorator
{
	public RedshapeDecorator(Shape decoratorShape)
	{
		super(decoratorShape);
    	}
   
	public void draw()
   	{  
		decoratorShape.draw();
		setRedBorder(decoratorShape);
   	}
   private void setRedBorder(Shape decoratorShape)
   {
     System.out.println("border colour: RED");
   }
}

class DecoratorPatternDemo
{
  public static void main(String args[])
  {
   Shape circle=new Circle();
         circle.draw();
   Shape rect=new Rectangle();
         rect.draw();
   Shape redcircle=new RedshapeDecorator(new Circle());
         redcircle.draw();      
   Shape redrect=new RedshapeDecorator(new Rectangle());
         redrect.draw();  
  }

}
 
