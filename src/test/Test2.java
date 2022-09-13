package test;

import javastreamdebugger.Employee;

import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String pattern = "abba";
        String[] str = s.split(" ");
        for(int i = 0;i< pattern.length();i++){
            int j = i + 1;
            while(j < pattern.length()){
                System.out.println(pattern.charAt(i) + " = " + pattern.charAt(j));
                j++;
           }
        }

        Product product = new Product();
        product.setAvailability(true);
        product.setDiscountedPrice(12.45);
        product.setId(6);
        Product product1 = new Product();
        product1.setAvailability(false);
        product1.setDiscountedPrice(15.45);
        product1.setId(3);
        Product product2 = new Product();
        product2.setAvailability(false);
        product2.setDiscountedPrice(10.45);
        product2.setId(5);
        Product product3 = new Product();
        product3.setAvailability(false);
        product3.setDiscountedPrice(12.45);
        product3.setId(1);
        Product product4 = new Product();
        product4.setAvailability(false);
        product4.setDiscountedPrice(13.45);
        product4.setId(3);
        Product product5 = new Product();
        product5.setDiscountedPrice(13.67);
        product5.setId(4);
        product5.setAvailability(true);
        Product product6 = new Product();
        product6.setDiscountedPrice(12.45);
        product6.setId(7);
        product6.setAvailability(true);



        List<Product> booleana = List.of(product,product1,product2,product3,product4,product5,product6);
        booleana.stream().sorted(Comparator.comparing(Product::getAvailability).reversed()

                        .thenComparing(Product::getDiscountedPrice)
                        .thenComparing(Product::getId))
                .forEach(System.out::println);
    }


}

 class Product {
    Integer id;
    boolean availability;
    double discountedPrice;


    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public double getDiscountedPrice() {
         return discountedPrice;
     }

     public void setDiscountedPrice(double discountedPrice) {
         this.discountedPrice = discountedPrice;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "id=" + id +
                 ", availability=" + availability +
                 ", discountedPrice=" + discountedPrice +
                 '}';
     }
 }
