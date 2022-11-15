class Pattern3  
{              
	public static void main(String[] args)   
	{  
		int i, j, k = 1;  
									//inner loop  
		for (i = 1; i <= 5; i++)   
		{  
									//outer loop  
			for (j = 1; j< i + 1; j++)   
			{  
									//prints the value of k  
				System.out.print(k++ + " ");  
			}    
		System.out.println();  
		}  
	}  
}  