class RevString
 {
   public static void main(String []args)
    {
      String s="you are welcome";
               String s1[];
               s1=s.split(" ");

          for(int i=0;i<s1.length;i++)
              {
                for(int j=s1[i].length()-1;j>=0;j--)
                    {
                     System.out.print(s1[i].charAt(j));
                     }
              System.out.print(" ");
               }
          
    }
}
            