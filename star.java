import java.util.*;
class Star
  {
    public static void main(String []args)
    {
     System.out.println("Enter any Number");
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
    for(int i=1;i<=n;i++)
      {
        for(int j=i;j<=n-1;j++)
         {
            System.out.print(' ');
         }
           for(int k=1;k<=i;k++)
            {
             System.out.print('*');
             System.out.print(' ');
            }     
    System.out.println();
      }
    }
 }


