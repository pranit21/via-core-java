class Person {
	String name;
	int hands, legs;
	private int lungPower;
	private static int count;
	
	/*Person() {
	}
	
	Person(String name, int h, int l) {
		this.name = name;
		this.hands = h;
		this.legs = l;
		this.lungPower = 30;
		this.count++;
	}*/
	
	void run() {
		System.out.println(this.name + " running with " + this.legs + " legs.");
	}
	
	/*void getCount() {
		System.out.println("The total count is " + this.count);
	}
	
	void doYoga() {
		this.lungPower += 5;
	}
	
	void smoke() {
		this.lungPower--;
	}
	
	void consult() {
		System.out.println(this.name + " has a lung power of " + this.lungPower);
	}*/
}

class PersonTest {
	public static void main(String[] args) {
		Person hari = new Person();
		hari.hands = 2;
		hari.legs = 2;
		hari.name = "Hari";
		hari.run();
		
		/*Person hari = new Person("Hari", 2, 2);
		hari.doYoga();
		hari.doYoga();
		hari.consult();
		hari.run();
		hari.getCount();*/
		
		Person alex = new Person();
		alex.hands = 2;
		alex.legs = 1;
		alex.name = "Alex";
		alex.run();
		
		/*Person alex = new Person("Alex", 2, 1);
		alex.smoke();
		alex.consult();
		alex.lungPower = 100;
		alex.consult();
		alex.run();
		alex.legs = 1;
		alex.run();
		alex.getCount();*/
	}
}