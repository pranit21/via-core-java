class ShortHand {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d;
		
		a += 5;
		b *= 4;
		c += a * b;
		c %= 6;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		c = ++b;
		d = a++;
		System.out.println("Increment Operator:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("(c = ++b) = " + c);
		c++;
		System.out.println("c++ = " + c);
		System.out.println("(d = a++) = " + d);
		
		c = --b;
		d = a--;
		System.out.println("Decrement Operator:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("(c = --b) = " + c);
		c--;
		System.out.println("c-- = " + c);
		System.out.println("(d = a--) = " + d);
	}
}