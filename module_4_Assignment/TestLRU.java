import java.util.*;
class LruCache<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;
    LruCache(int c){super(c,0.75f,true);capacity=c;}
    protected boolean removeEldestEntry(Map.Entry<K,V> e){return size()>capacity;}
}
class TestLRU {
    public static void main(String[] a){
        LruCache<Integer,String> cache=new LruCache<>(3);
        cache.put(1,"A"); cache.put(2,"B"); cache.put(3,"C");
        cache.get(1); cache.put(4,"D");
        System.out.println(cache);
    }
}
