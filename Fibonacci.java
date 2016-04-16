class Fibonacci
{
	public static void main(String args[])
	{
	
		System.out.println("************************* Printing Fibonnaci Series ************************");
		int x = 0;
		int y = 1;
		System.out.print(x + " " + y);
		
		for(int i=1;i<=10;i++)
		{
			int z = x + y;
			System.out.print(" "+z);			
			x = y ;
			y = z ;
		}
		
	}
}