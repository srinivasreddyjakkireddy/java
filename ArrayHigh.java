import java.util.*;
class Array2
 {
    public static void main(String []args)
     {
int largest=0;
        int a[]=new int[5];
       System.out.println("Enter "+a.length+" values");
       Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
           {
             a[i]=s.nextInt();
           }
for(int j=0;j<=4;j++)
 {
     if(a[j]>largest)
         {
            largest=a[j];
         }
    }
System.out.print(largest);
            
           
       }
 }
        
              
        