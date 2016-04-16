import java.io.*;
public class Hunter {
	public static void beat(Animal a){
		a.yell();
	}

	public static void main(String[] args){
		int n;
		System.out.println("List of Animals to be beaten\nMenu:\n1:Dog\n2:Cow\n3:Duck\n0:Exit");
		DataInputStream ins=new DataInputStream(System.in); 
		try{
			while((n=Integer.parseInt(ins.readLine())) != 0){
				switch(n){
				case 1 : Dog dog = new Dog(); beat(dog); break;
				case 2 : Cow cow = new Cow(); beat(cow); break;
				case 3 : Duck duck = new Duck(); beat(duck); break;
				default : System.out.println("Invalid Animal"); break;
				}
			} 
		} catch(IOException e) {
			System.out.println("Invalid Input");
		}
	}
}

abstract class Animal {
	abstract public void yell();
}

class Dog extends Animal {
	public void yell(){
		System.out.println("Bhow Bhow");
	}
}

class Cow extends Animal {
	public void yell(){
		System.out.println("Moaaaaaaaaah");
	}
}

class Duck extends Animal {
	public void yell(){
		System.out.println("Quack Quack");
	}
}