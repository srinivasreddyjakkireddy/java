import java.util.*;
class Recursive
  {
     int rec(int a,int b)
             {
                 if(b==1)
                 return a; 
                 a=rec(a,b-1)*a;
                     return a;
                   
                 
              
              }
      public static void main(String []args)
        {
           Scanner s=new Scanner(System.in);
           System.out.println("Enter a value");
              int a=s.nextInt();
              System.out.println("Enter b value");
               int b=s.nextInt();
             Recursive r=new Recursive();          
                      int res=r.rec(a,b);
             System.out.println(res);
       }
   }    