class TestReverse {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int reverse = findReverse(number);
		System.out.println(reverse);
	}
	
	static int findReverse(int number) {
		int rev = 0;
		do {
			rev = (rev * 10) + (number % 10);
			number = number / 10;
		} while(number != 0);
		
		return rev;
	}
}