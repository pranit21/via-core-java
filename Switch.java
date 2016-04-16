class Switch
{
	public static void main(String args[])
	{
		String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		int mnt = Integer.parseInt(args[0]);
		
		switch(mnt){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("There are 31 days in the month of "+ months[mnt-1]);break;
		case 2: System.out.println("There are 28 days in the month of "+ months[mnt-1]);break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("There are 30 days in the month of "+ months[mnt-1]);break;
		default : System.out.println("Wrong month");
		}
	}
}