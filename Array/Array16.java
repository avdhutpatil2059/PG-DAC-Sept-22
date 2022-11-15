 class Array16 
{
   public static void main(String args[]) 
   {
      int a[] = {23, 36, 96, 78, 55};
	  
      int b[] = {78, 45, 19, 73, 55};
      System.out.println("Intersection of the two arrays ::");
     
      for(int i = 0; i<a.length; i++ ) 
	  {
         for(int j = 0; j<b.length; j++) 
		 {
            if(a[i]==b[j])
			{
               System.out.println(b[j]);
            }
         }
      }
   }
}