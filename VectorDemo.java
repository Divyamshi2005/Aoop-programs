import java.util.*;
class VectorDemo
{
	public static void main(String args[])
            {
                Vector<Integer> v=new Vector<Integer>();
                   int x[]={10,20,30,40,50,60};
               
                    for(int i=0;i<x.length;i++)
                      {
                         v.add(x[i]);
                      }

                    for(int i=0;i<v.size();i++)
                      {
                        System.out.println(v.get(i));
                      }

                    System.out.println("retrive using list iterator");
            ListIterator li=v.listIterator();
              System.out.println("in forward direction");
                   while(li.hasNext())
                     {
                           System.out.println(li.next());
                     }
               System.out.println("in backward direction");    
                    while(li.hasPrevious())
                     {
                           System.out.println(li.previous());
                     }
             }
 }  