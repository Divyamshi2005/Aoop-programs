import java.util.*;
 class employee
{
   private int empno;
           String empname;
           int empsalary;
   
   public void input()
{
     Scanner sc=new Scanner(System.in);

             System.out.println("enter empno");
             empno=sc.nextInt();

            System.out.println("enter empname");
             empname=sc.next();

System.out.println("enter empsalary");
empsalary=sc.nextInt();
 }
public void output()
{
System.out.println(" employee number is"+empno);
System.out.println(" employee name"+empname); 
System.out.println(" employee salary"+empsalary);
}
}
class emp
{
  public static void main(String args[])
       {
        employee divya=new employee();
         divya.input();
          divya.output();
       }  
}
    







