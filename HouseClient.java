//step1: create a abstract class HouseTemplate
abstract class HouseTemplate
{ 
   //template method final
   public final void buildHouse()
    {
   	buildFoundation();
	buildPillars();
        buildWalls(); 
        buildWindows();
    } 

   //default implementation
	 public void buildFoundation() 
	  {
  		System.out.println("building foundation with concetre cement and sand");
 	  }
 
 //methods to be implemented in subclasses 
  public abstract void buildWindows();
  public abstract void buildPillars();
  public abstract void buildWalls();
}

class WoodenHouse extends HouseTemplate
{ 
  public void buildPillars()
   {  
     System.out.println("Building Wooden Pillars");
   }  
  public void buildWalls()
   {
     System.out.println("Building Wooden Walls"); 
   }
  public void buildWindows()
   {
     System.out.println("Building Wooden Windows"); 
   }
}


class GlassHouse extends HouseTemplate
{
  public void buildPillars()
   {
     System.out.println("Building Glass Pillars");
   }
  public void buildWalls()
   {
     System.out.println("Building GLass Walls"); 
   }
  public void buildWindows()
   { 
     System.out.println("Building Glass Windows"); 
   }
}


class HouseClient
{
   public static void main(String args[])
     { 
        HouseTemplate ht=new WoodenHouse();
        System.out.println("Wooden HOuse "); 
        ht.buildHouse();
  
       System.out.println("Glass House"); 
       ht=new GlassHouse(); 
       ht.buildHouse();
     }
}