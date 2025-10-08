import java.util.*;
class WeakMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Object,String> map=new WeakHashMap<>();
        Object key=new Object();
        map.put(key,"Value");
        System.out.println("Before GC: "+map);
        key=null;
        System.gc();
        System.out.println("After GC: "+map);
    }
}
