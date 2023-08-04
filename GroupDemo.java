import java.util.*;
class Employee
{
     int id;
     String name;
   Employee(int i,String n)
     {
       id=i;
       name=n;
      }
   void displayData()
    {
      System.out.println(id+"\t"+name);
     }
 }

class GroupDemo
{
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        Employee arr[]=new Employee[5];
           for(int i=0;i<5;i++)
            {
               System.out.println("enter id"); 
                int id=sc.nextInt();
               System.out.println("enter name");
                String name=sc.next();
               arr[i]=new Employee(id,name);
             }
       System.out.println("the empl is ");
        for(int i=0;i<arr.length;i++)
         {
             arr[i].displayData();
          }
     }  
 }