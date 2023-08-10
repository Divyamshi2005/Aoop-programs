import java.util.*;
class HashSetDemo
{
       public static void main(String args[])
         {
            HashSet<String> hs=new HashSet<String>();

            hs.add("India");
            hs.add("canada");
            hs.add("srilanka");
            hs.add("India");
            hs.add("china");
      System.out.println(hs);
 
       Iterator it=hs.iterator();
         while(it.hasNext())
          {
               System.out.println("using iterator");
               System.out.println(it.next());
           }
      }
}      
  