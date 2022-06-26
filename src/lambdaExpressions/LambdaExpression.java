package lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

//Giúp tiết kiệm viết code, sử dụng biểu thức(expression). 
//Lambda expression được coi như một hàm vì vậy không tạo file .class

interface NoParameter{  
    public String noParam();
}  
interface SingleParameter{  
    public String singleParam(String name);
}  
interface MultipleParameters{  
    int add(int a,int b);  
}  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class LambdaExpression{  
	public static void main(String[] args) {  
		// Lambda expression with no parameter.
		NoParameter noParameter = () -> {
			return "This is No Parameter";
		};
		System.out.println(noParameter.noParam());

		// Lambda expression with single parameter.
		SingleParameter singleParameter1 = (name) -> {
			return "This is " + name;
		};
		System.out.println(singleParameter1.singleParam("Single Parameter"));
		// You can omit function parentheses
		SingleParameter singleParameter2 = name -> {
			return "This is " + name;
		};
		System.out.println(singleParameter2.singleParam("Single Parameter"));
		
		// You can pass multiple statements in lambda expression  
		SingleParameter singleParameter3 = (message)-> {  
            String str1 = "Multiple statements ";  
            String str2 = str1 + message;   
            return str2;  
        };  
        System.out.println(singleParameter3.singleParam("in lambda expression"));  

		// Multiple parameters in lambda expression
		MultipleParameters multipleParameters1 = (a, b) -> (a + b);
		System.out.println(multipleParameters1.add(10, 20));
        
        // Multiple parameters with data type in lambda expression  
		MultipleParameters multipleParameters2 = (int a, int b) -> (a + b);
		System.out.println(multipleParameters2.add(100, 200));
	    
        // Lambda expression with return keyword.    
        MultipleParameters multipleParameters3 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(multipleParameters3.add(200, 200));
	    
		// Lambda expression with Foreach Loop.  
		List<String> list=new ArrayList<String>();  
        list.add("Lambda ");  
        list.add("expression ");  
        list.add("Foreach ");  
        list.add("Loop");  
          
        list.forEach(  
            (n)->System.out.print(n)  
        );  
        
        
        //Thread Example without lambda  
        Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("\nThread1 is running...");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  
        //Thread Example with lambda  
        Runnable r2=()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
    
        // Lambda expression with Comparator and Filter Collection Data. 
        List<Product> listProducts=new ArrayList<Product>();  
        listProducts.add(new Product(1,"HP Laptop",25000f));  
        listProducts.add(new Product(3,"Keyboard",300f));  
        listProducts.add(new Product(2,"Dell Mouse",150f));  
        System.out.println("\nSorting on the basis of name...");  
  
        Collections.sort(listProducts,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        });  
        for(Product p:listProducts){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
      
        Stream<Product> filtered_data = listProducts.stream().filter(p -> p.price > 20000);  
        System.out.println("\nFilter...");  
        filtered_data.forEach(  
                p -> System.out.println(p.id+" "+p.name+" "+p.price)  
        );  
        
	}  
}  
