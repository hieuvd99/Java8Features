package collectors;

/*
 * Collectors là một final class extends Object class.
 * Nó cung cấp các thao tác rút gọn, tóm tắt các phần tử theo nhiều tiêu chí khác nhau, v.v.
 */

import java.util.stream.Collectors;  
import java.util.List;
import java.util.Set;
import java.util.ArrayList;  
class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaCollectors {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        List<Float> productPriceList =   
                productsList.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  
        
        Set<Float> productPriceList1 =   
                productsList.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toSet());   // collecting as list  
        System.out.println(productPriceList1);  
        
        Double sumPrices =   
                productsList.stream()  
                            .collect(Collectors.summingDouble(x->x.price));  // collecting as list  
        System.out.println("Sum of prices: "+sumPrices);  
        
        Double average = productsList.stream()  
                .collect(Collectors.averagingDouble(p->p.price));  
        System.out.println("Average price is: "+average);  
        
        Long noOfElements = productsList.stream()  
                .collect(Collectors.counting());  
        System.out.println("Total elements : "+noOfElements);  
    }  
}  