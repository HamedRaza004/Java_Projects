import java.util.*;
class Banking {
    public static void main(String[] args) {
        Map<Integer,Double> accounts=new HashMap<>();
        accounts.put(101,1000.0);
        accounts.put(102,500.0);
        accounts.put(101,accounts.get(101)+200.0);
        System.out.println(accounts);
    }
}
