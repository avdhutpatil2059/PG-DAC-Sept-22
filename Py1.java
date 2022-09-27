class Py1{
	public static void main(String args[]){
		
		//int p=5;
		
		for(int i=1;i<=9;i++)
		{
			
			for( int k= 8; k>=i;k--)
		    {
				System.out.print(" ");
		    }
			for(int j=1;j<=i;j++)
			{
			   System.out.print(i+" ");
			}
		
			System.out.print("\n");
		}
		
	}
}