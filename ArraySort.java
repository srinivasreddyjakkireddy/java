import java.util.*;
class ArraySort
 {
     public static void main(String []args)
         {
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the length of the array");
           int n=s.nextInt();
           int arr[]=new int[n];
            System.out.println("Enter "+n+" values of arr");
         for(int i=0;i<n;i++)
           { 
             arr[i]=s.nextInt();
           }
         for(int k=0;k<arr.length-1;k++)
              {
               int temp;
               for(int m=k+1;m<arr.length;m++)
                {
                  if(arr[k]>arr[m])
                     {
                      temp=arr[m];
                     arr[m]=arr[k];
                       arr[k]=temp;
                    }
               }
             }
           System.out.println("The Sorted Array is..");
           for(int l=0;l<arr.length;l++)
              {
                System.out.print(arr[l]+" ");
              }
         }       
 }       