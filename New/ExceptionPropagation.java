class ExceptionPropagation {
	void method1() throws java.io.IOException {
		//int a = 50/0;
		//throw new ArithmeticException("Not eligible for voting");
		throw new java.io.IOException("Not eligible for voting");
	}

	void method2() throws java.io.IOException {
		method1();
	}

	void method3() throws java.io.IOException {
		//try {
			method2();
		/*} catch(java.io.IOException e) {
			e.printStackTrace();
		}*/
	}

	public static void main(String[] args) throws java.io.IOException {
		ExceptionPropagation t = new ExceptionPropagation();
		t.method3();
		System.out.println("Rest of code...");
	}
}