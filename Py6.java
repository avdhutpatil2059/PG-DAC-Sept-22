class Py6{
	public static void main(String args[]){
		
		int p=9;
		
		for(int i=p;i>=1;i--)
		{
			
			for( int k=p-1; k>=i;k--)
		    {
				System.out.print(" ");
		    }
			for(int j=i;j>=1;j--)
			{
			   System.out.print("* ");
			}
		
			System.out.print("\n");
		}
		
	}
}