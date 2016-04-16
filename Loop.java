class Loop
{
	public static void main(String args[])
	{
	
		System.out.println("************************* Printing All Numbers ************************");
		for(int i=0;i<10;i++)
			System.out.println(i);
			
		//Reverse Loop Program
		System.out.println("************************* Printing All Numbers in Reverse ************************");
		for(int i=10;i>0;i--)
			System.out.println(i);
			
		//Even Loop
		System.out.println("************************* Printing Even Numbers ************************");
		for(int i=0;i<10;i=i+2)
		{
			System.out.println(i);
		}
		
		//Odd Loop
		System.out.println("************************* Printing Odd Numbers ************************");
		for(int i=1;i<10;i=i+2)
		{
			System.out.println(i);
		}
		
		System.out.println("************************* Table of 3 ************************");
		//Table of 3
		int tableOf = 3;
		for(int i=1;i<=10;i++)
		{
			System.out.println(tableOf+" x "+i+" = "+(tableOf*i));
		}
	}
}