import java.util.*;
class MergePQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> q1=new PriorityQueue<>(List.of(3,1,5));
        PriorityQueue<Integer> q2=new PriorityQueue<>(List.of(4,2,6));
        q1.addAll(q2);
        while(!q1.isEmpty()) System.out.print(q1.poll()+" ");
    }
}
