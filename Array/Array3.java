 class Array3{
    public static void main(String args[])
    {
        int[] arr = { 1, 5, 4, 2, 5 };
        int sum = 6;
        getCount(arr, sum);
    }
 
     
    public static void getCount(int[] arr, int sum)
    {
 
        int count = 0;  
 
         
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.println("Count of pairs is "+count);
    }
}
 