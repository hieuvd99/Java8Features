package optionalClass;

import java.util.Optional;

/*
 * Nó là một public final class và được sử dụng để xử lý NullPointerException trong ứng dụng Java.
 * Bạn phải nhập gói java.util để sử dụng lớp này.
 * Nó cung cấp các phương thức được sử dụng để kiểm tra sự hiện diện của giá trị cho biến cụ thể.
 */

public class OptionalClass {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index  
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) { // check for value is present or not
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else
			System.out.println("string value is not present");
	}
}