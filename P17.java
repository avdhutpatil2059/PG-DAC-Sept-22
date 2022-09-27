
class P17
	{
		public static void main(String args[])
		{
			int i, j, c=0;
			for (i=1; i<=5; i++)
			{
				for(j=1; j<=i; j++)
				{
					c = c+1;
					System.out.print(c+" ");
				}
				System.out.println();
			}
		}
	}