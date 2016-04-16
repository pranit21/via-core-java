public class AnonymousDemo {
    interface HelloWorld {
        public void greet();
    }
  
    public void sayHello() {
        class EnglishGreeting implements HelloWorld {
            public void greet() {
                System.out.println("Hello");
            }
        }
      
        HelloWorld englishGreeting = new EnglishGreeting();
        
        HelloWorld hindiGreeting = new HelloWorld() {
            public void greet() {
                System.out.println("Namaste");
            }
        };
        
        HelloWorld marathiGreeting = new HelloWorld() {
            public void greet() {
                System.out.println("Namaskar");
            }
        };
		
        englishGreeting.greet();
        hindiGreeting.greet();
        marathiGreeting.greet();
    }

    public static void main(String... args) {
        AnonymousDemo myApp = new AnonymousDemo();
        myApp.sayHello();
    }            
}