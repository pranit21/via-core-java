class StringEqualsTest {
	public static void main(String[] args) {
		String s1 = "Hello", s2 = "Hello";
		System.out.println(s1 == s2);
		
		String s3 = new String("Hello"), s4 = new String("Hello");
		System.out.println(s3 == s4);
	}
}