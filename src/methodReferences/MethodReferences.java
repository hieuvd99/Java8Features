package methodReferences;

import java.util.function.BiFunction;

/*Method References được sử dụng để tham chiếu method của functional interface.
Đây là dạng biểu thức lambda nhỏ gọn và dễ dàng. Mỗi khi bạn đang sử dụng lambda expression để chỉ tham chiếu một mothod
bạn có thể thay thế lambda expression của mình bằng method references*/

class Arithmetic {
	//Reference to a Static Method
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
	//Reference to an Instance Method
	public int add1(int a, int b) {
		return a + b;
	}
}

//Reference to a Constructor
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  

public class MethodReferences {
	public static void main(String[] args) {
		//Reference to a Static Method
		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
		BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		//Reference to an Instance Method
		BiFunction<Integer, Integer, Integer>adder = new Arithmetic()::add1;  
		int result = adder.apply(10, 20);  
		System.out.println(result); 
		
		//Reference to a Constructor
		Messageable hello = Message::new;  
        hello.getMessage("Hello");  
	}
}