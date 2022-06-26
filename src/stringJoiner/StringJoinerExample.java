package stringJoiner;

/*
 * Java đã thêm một final class StringJoiner trong gói java.util. 
 * Nó được sử dụng để xây dựng một chuỗi các ký tự được phân tách bằng dấu phân cách.
 * Bây giờ, bạn có thể tạo chuỗi bằng cách chuyển các dấu phân cách như dấu phẩy (,), dấu gạch ngang (-), v.v.
 *Bạn cũng có thể chuyển tiền tố và hậu tố cho chuỗi ký tự.
 */

import java.util.StringJoiner;
public class StringJoinerExample {  
    public static void main(String[] args) {  
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
          
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
        System.out.println(joinNames);  
        
        StringJoiner joinNames1 = new StringJoiner(":", "[", "]");   // passing comma(,) and square-brackets as delimiter   
        
        // Adding values to StringJoiner  
        joinNames1.add("Rahul");  
        joinNames1.add("Raju");  
        joinNames1.add("Peter");  
        joinNames1.add("Raheem");  
        System.out.println(joinNames1);  
        
        // Merging two StringJoiner  
        StringJoiner merge = joinNames.merge(joinNames1);   
        System.out.println(merge);  
    }  
}  