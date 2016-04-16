class Student {
	public static void main(String args[]) {
		byte rollNo = Byte.parseByte(args[0]);
		int maths, science, english;
		float avg;
		
		maths = Integer.parseInt(args[1]); 
		science = Integer.parseInt(args[2]);
		english = Integer.parseInt(args[3]);
		
		avg = ( maths + science + english ) / 3;
		
		System.out.println("Roll number is = " + rollNo); 
		System.out.println("Average is = " + avg); 
	}
}