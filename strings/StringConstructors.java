// Construct one String from another.
class StringConstructors {
	char arr[] = {'a', 'b', 'c', 'd'};
	public static void main(String args[]) {
		char c[] = {'J', 'a', 'v', 'a'};
		String s1 = new String(c);
		String s2 = new String(s1);
		String s3 = "Welcome to Java";
		
		byte ascii[] = {65, 66, 67, 68, 69, 70 }; 
		String s4 = new String(ascii);
		
		String s5 = "He is " + 24 + " years old.";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s2.length());
		System.out.println("Hello Java".charAt(6));
		
		StringConstructors sc = new StringConstructors();
		System.out.println(sc);
		
		String s = "This is a demo of the getChars method.";
		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];
		
		// void getChars(int sourceStart, int sourceEnd, char target[ ], int targetStart)
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
		
		// char[ ] toCharArray( )
		// String concat(String str)
		System.out.println("Hello".replace('l', 'w'));
		System.out.println("Hello".replace("Hell", "Will"));
		System.out.println(" Hello World ".trim());
		System.out.println(String.valueOf(1.0f));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String s9=new String("karthik");
		s9.concat("reddy");
		System.out.println(s9);
	}
	
	public String toString() {
		String str = "Elements in the array: [";
		for(char x : arr)
			str += x + ",";
		// String substring(int startIndex, int endIndex)
		str = str.substring(0, str.length() - 1);
		str += "]";
		
		return str;
	}
}