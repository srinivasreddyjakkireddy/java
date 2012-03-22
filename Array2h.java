import java.util.*;
class Array2
 {
    public static void main(String []args)
     {
int largest=0,secondlargest=0;
        int a[]=new int[5];
       System.out.println("Enter array values");
       Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
           {
             a[i]=s.nextInt();
           }
for(int j=0;j<=4;j++)
 {
     if(a[j]>largest)
         {
          secondlargest=largest;
            largest=a[j];
         }
    if(secondlargest<a[j]&&largest!=a[j])
          secondlargest=a[j];
 }
System.out.print(secondlargest);
            
           
       }
 }
        
              
        