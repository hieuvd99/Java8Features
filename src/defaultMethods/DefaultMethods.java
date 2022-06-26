package defaultMethods;

/*
 * Các phương thức được định nghĩa bên trong giao diện và được gắn thẻ default được gọi là default methods.
 * Các phương thức này là các phương thức không trừu tượng.
 */

interface Sayable {
	// default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);

	// static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

abstract class AbstractClass {
	public AbstractClass() { // constructor
		System.out.println("You can create constructor in abstract class");
	}

	abstract int add(int a, int b); // abstract method

	int sub(int a, int b) { // non-abstract method
		return a - b;
	}

	static int multiply(int a, int b) { // static method
		return a * b;
	}
}

public class DefaultMethods extends AbstractClass implements Sayable{
	public int add(int a, int b) { // implementing abstract method
		return a + b;
	}
	
	public void sayMore(String msg) {
		System.out.println(msg);    
		
	}
	
	public static void main(String[] args) {
		DefaultMethods a = new DefaultMethods();
		
		a.say(); // calling default method
		a.sayMore("Work is worship"); // calling abstract method
		Sayable.sayLouder("Helloooo..."); // calling static method

		int result1 = a.add(20, 10); // calling abstract method
		int result2 = a.sub(20, 10); // calling non-abstract method
		int result3 = AbstractClass.multiply(20, 10); // calling static method
		System.out.println("Addition: " + result1);
		System.out.println("Substraction: " + result2);
		System.out.println("Multiplication: " + result3);
	}

	
}