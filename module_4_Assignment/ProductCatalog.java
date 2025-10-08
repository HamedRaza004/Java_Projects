import java.util.*;
class ProductCatalog {
    public static void main(String[] args) {
        TreeMap<String,Double> products=new TreeMap<>();
        products.put("Apple",1.2);
        products.put("Banana",0.8);
        products.put("Cherry",2.5);
        products.forEach((k,v)->System.out.println(k+" = "+v));
    }
}
