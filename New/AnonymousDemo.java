interface HelloWorld {
	public void greet();
}
public class AnonymousDemo {
	class EnglishGreeting implements HelloWorld {
		public void greet() {
			System.out.println("Hello");
		}
	}
  
    public void sayHello() {
        HelloWorld englishGreeting = new EnglishGreeting();
        
        HelloWorld hindiGreeting = new HelloWorld() {
            public void greet() {
                System.out.println("Namaste");
            }
        };
		
        englishGreeting.greet();
        hindiGreeting.greet();
		
		testGreet(new HelloWorld() {
			public void greet() {
                System.out.println("Namaskar");
            }
		});
    }
	
	public void testGreet(HelloWorld hw) {
		hw.greet();
	}

    public static void main(String... args) {
        AnonymousDemo myApp = new AnonymousDemo();
        myApp.sayHello();
		
		HelloWorld hw = myApp.new EnglishGreeting();
		hw.greet();
    }            
}