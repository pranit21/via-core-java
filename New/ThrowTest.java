class ThrowTest {
	static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not eligible for voting");
		} else {
			System.out.println("Welcome to voting!!!");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(13);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of code...");
	}
}