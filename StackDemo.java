import java.util.*;
class StackDemo
{
   public static void main(String args[])
         {
            Stack<Integer> st=new Stack<Integer>();
 
              int choice=0;
              int element,position;
              Scanner sc=new Scanner(System.in);
         
          
             {
                System.out.println("stack operations menu");
                System.out.println("1. push operation ");
                System.out.println("2. pop operation"); 
                System.out.println("3. search operation"); 
                System.out.println("4. exit");
       
                  choice=sc.nextInt();
 
           switch(choice)
           {
                  case 1 : System.out.println("enter element");
                           element=sc.nextInt();
                            st.push(element);
                             break;
                        
                  case 2 : 
                           Integer obj=st.pop();
                            System.out.println("pop obj is");
                             break;
              
                 case 3 : 
                           
                            System.out.println("pop obj is");
                             element=sc.nextInt();
                             position=st.search(element);
                             if(position==-1)
                             System.out.println("position is"+position); 
                             break;
          
                 default:      return;
           }    
      
                 System.out.println("stack contents"+st);
          }
        }
}