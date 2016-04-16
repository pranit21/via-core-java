class Light { 
	public static void main(String args[]) { 
		int lightspeed; 
		long days; 
		long seconds; 
		long distance; 
		
		// This is line comment
		/* This is document comment:
		approximate speed of light in miles per second */
		lightspeed = 186000; 
		days = 1000;
		seconds = days * 24 * 60 * 60;
		distance = lightspeed * seconds;
		
		System.out.print("In " + days + " days light will travel about " + distance + " miles."); 
	} 
}