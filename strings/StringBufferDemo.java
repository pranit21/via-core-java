// StringBuffer length vs. capacity.
class StringBufferDemo {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");
		
		// void ensureCapacity(int capacity);
		System.out.println("buffer = " + sb);
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("I Java!");
		sb1.insert(2, "like ");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		StringBuffer sb2 = new StringBuffer("This is a test.");
		sb2.delete(4, 7);
		System.out.println("After delete: " + sb2);
		sb2.deleteCharAt(0);
		System.out.println("After deleteCharAt: " + sb2);
		sb2.replace(5, 7, "was");
		System.out.println("After replace: " + sb2);
		// String substring(int startIndex)
		// String substring(int startIndex, int endIndex)
	}
}