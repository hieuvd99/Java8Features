package functionalInterfaces;

/*
 * Interface chứa chính xác một abstract method được gọi là functional interface.
 * Nó có thể có bất kỳ số lượng default, static methods nhưng
 * chỉ có thể chứa một abstract method. Nó cũng có thể khai báo các phương thức của lớp đối tượng.
 */

@FunctionalInterface
interface sayable {
	void say(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class FunctionalInterfaces implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaces fie = new FunctionalInterfaces();
		fie.say("Hello there");
	}
}