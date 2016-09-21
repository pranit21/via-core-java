public class StringDifference {
    public static void main(String[] args) {
		String str1 = "Hello";
		System.out.println(str1 + "--------" + str1.hashCode());
		str1 += " World!";
		System.out.println(str1 + "--------" + str1.hashCode());
		
		StringBuffer str2 = new StringBuffer("Hello");
		System.out.println(str2 + "--------" + str2.hashCode());
		str2.append(" World!");
		System.out.println(str2 + "--------" + str2.hashCode());
		
		StringBuilder str3 = new StringBuilder("Hello");
		System.out.println(str3 + "--------" + str3.hashCode());
		str3.append(" World!");
		System.out.println(str3 + "--------" + str3.hashCode());
		
		String str4 = "Hello ";
		str4.concat("Java");
		System.out.println(str4);
		
		StringBuffer str5 = new StringBuffer("Hello ");
		str5.append("Java");
		System.out.println(str5);
		
    }
}