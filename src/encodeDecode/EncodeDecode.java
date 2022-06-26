package encodeDecode;

import java.util.Base64;

/*
 * Bạn có thể Encode và Decode dữ liệu của mình bằng cách sử dụng các phương pháp được cung cấp. 
 * Bạn cần nhập java.util.Base64 trong tệp nguồn của mình để sử dụng các phương pháp của nó.
 */

public class EncodeDecode {  
    public static void main(String[] args) {  
    	// Getting encoder  
        Base64.Encoder encoder = Base64.getUrlEncoder();  
        // Encoding URL  
        String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());  
        System.out.println("Encoded URL: "+eStr);  
        // Getting decoder  
        Base64.Decoder decoder = Base64.getUrlDecoder();  
        // Decoding URl  
        String dStr = new String(decoder.decode(eStr));  
        System.out.println("Decoded URL: "+dStr);  
        
        // Getting MIME encoder  
        Base64.Encoder encoder1 = Base64.getMimeEncoder();  
        String message = "Hello, \nYou are informed regarding your inconsistency of work";  
        String eStr1 = encoder1.encodeToString(message.getBytes());  
        System.out.println("Encoded MIME message: "+eStr1);  
          
        // Getting MIME decoder  
        Base64.Decoder decoder1 = Base64.getMimeDecoder();  
        // Decoding MIME encoded message  
        String dStr1 = new String(decoder1.decode(eStr1));  
        System.out.println("Decoded message: "+dStr1);   
    }  
}  