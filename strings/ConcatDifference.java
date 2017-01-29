public class ConcatDifference {
    public static String concatWithString() {
        String t = "Cat";
        for (int i=0; i<100000; i++) {
            t = t + "Dog";
        }
        return t;
    }
    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Cat");
        for (int i=0; i<1000000; i++) {
            sb.append("Dog");
        }
        return sb.toString();
    }
    public static String concatWithStringBuilder() {
        StringBuilder sb = new StringBuilder("Cat");
        for (int i=0; i<1000000; i++) {
            sb.append("Dog");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatWithString();
        System.out.println("Concat with String took: " + (System.currentTimeMillis() - start) + "ms");
		
        start = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Concat with StringBuffer took: " + (System.currentTimeMillis() - start) + "ms");
		
        start = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Concat with StringBuilder took: " + (System.currentTimeMillis() - start) + "ms");
    }
}