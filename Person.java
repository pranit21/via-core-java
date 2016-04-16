class Person {
	public int hands, legs;
	private int lungPower = 100;
	static private int count = 0;
	
	Person() {
		hands = 2;
		legs = 2;
		count++;
	}
	
	Person(int h, int l) {
		this.hands = h;
		this.legs = l;
		count++;
	}
	
	void run() {
		System.out.println("Running with " + hands + " hands and " + legs + " legs.");
	}
	
	int smoke() {
		return lungPower--;
	}
	
	int doYoga() {
		return lungPower++;
	}
	
	public static void main(String args[]) {
		Person hari = new Person();
		System.out.println("Person number - " + Person.count);
		hari.run();
		System.out.println("Lung Power after smoke - " + hari.smoke());
		System.out.println("Lung Power after doing yoga - " + hari.doYoga());
		
		Person alex = new Person(1, 2);
		System.out.println("Person number - " + Person.count);
		alex.run();
	}
}