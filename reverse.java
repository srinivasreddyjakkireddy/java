import java.util.*;
class Reverse
 {
    public static void main(String []args)
     {
      System.out.println("Enter valid  number");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     
      int sum=0,rem;
    
         while(n>0)
         {
           rem=n%10;
           sum=(sum*10)+rem;
           n=n/10;
         }
       System.out.println(sum);
     }
}

