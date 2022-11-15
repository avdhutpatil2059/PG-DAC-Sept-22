 class Array6{  
   public static int thirdLargest(int[] a, int b)
   {  
    int temp;  
		for (int i = 0; i < b; i++)   
        {  
            for (int j = i + 1; j < b; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[b-3];  
}  
		public static void main(String args[]){  
		int a[]={  24,54,31,16,82,45,67};  
   
			System.out.println("Third Largest: "+thirdLargest(a,7));  
  
}
}  