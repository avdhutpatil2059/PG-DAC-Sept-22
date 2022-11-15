import java.util.*;
class Array18
{
  public static void main(String args[])
  {
    int n;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the array size");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the element of array ");
    for(int i=0;i<n;i++)
	{
	  arr[i]=sc.nextInt();
	
	}
	System.out.println("Duplicate element in givin array");
	for(int i=0;i<n;i++)
	{
	  for(int j=i+1;j<n;j++)
	  {
	    if(arr[i]==arr[j])
		System.out.println(arr[j]);
	  
	  }
	
	}
  
  }


}