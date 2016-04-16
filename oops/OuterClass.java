public class OuterClass {
	public static void main(String[] args){
		InnerClass in = new InnerClass();
	}

	public class InnerClass {
		public InnerClass(){
			System.out.println("Inner Class Created...");
		}
	}
}