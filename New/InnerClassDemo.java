class Outer {
	static int outer_x = 100;
	
	void test() {
		Outer.Inner inner = new Outer.Inner();
		inner.display();
	}

	// this is an inner class
	static class Inner {
		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}
}
class InnerClassDemo {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();
	}
}