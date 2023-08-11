import java.util.*;

class ArrayListDemo
{
       public static void main(String args[])
         {
         ArrayList<String> al=new ArrayList<String>();

            al.add("apple");
            al.add("banana");
            al.add("mango");
            al.add("kiwi");
            al.add("apple");
      System.out.println(al);
       
            al.remove(3);
             al.remove("apple");
             System.out.println(al);   
             System.out.println(al.size());

      Iterator it=al.iterator();
         while(it.hasNext())
          {
               
               System.out.println(it.next());
           }

         
           }
      
}      
  