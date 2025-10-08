import java.util.*;
class BookCatalog {
    public static void main(String[] args) {
        Map<String,String> books=new HashMap<>();
        books.put("1984","Orwell");
        books.put("Hamlet","Shakespeare");
        System.out.println(books.get("1984"));
    }
}
