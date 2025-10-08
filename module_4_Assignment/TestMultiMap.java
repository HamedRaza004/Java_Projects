import java.util.*;
class MultiMap<K,V> {
    private Map<K,List<V>> map=new HashMap<>();
    void put(K k,V v){map.computeIfAbsent(k,x->new ArrayList<>()).add(v);}
    public String toString(){return map.toString();}
}
class TestMultiMap {
    public static void main(String[] a){
        MultiMap<String,Integer> mm=new MultiMap<>();
        mm.put("A",1); mm.put("A",2);
        System.out.println(mm);
    }
}
