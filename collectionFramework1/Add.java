package collectionFramework1;
import java.util.*;

class Add {
    public static void main(String[] args) {

        // LISTS
        List<Integer> list2 = new ArrayList<>();
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        // Vector
        List<Integer> l2 = new Vector<>();

        // LinkedList (raw type - not recommended)
        LinkedList list4 = new LinkedList();

        //  QUEUES
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> pq = new PriorityQueue<>();

        //  MAP
        Map<Integer, String> map = new HashMap<>();

        //  MAP OPERATIONS
        map.put(1, "java");
        map.put(2, "c++");

        System.out.println(map);
        System.out.println("Value for key 1: " + map.get(1));

        // PRIORITY QUEUE
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Removed: " + pq.poll());

        //  QUEUE
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);
        System.out.println("Removed: " + q.remove());
        System.out.println("Front: " + q.peek());

        //  LIST OPERATIONS
        list.add("Java");
        list.add("Python");
        list.add(1, "C++");

        list.set(1, "JavaScript");
        list.remove(2);

        System.out.println(list.get(0));
        System.out.println(list);

        //  LIST2 & LIST1
        list2.add(2);

        list1.add(1);
        list1.addAll(list2);

        System.out.println(list1);
        System.out.println(list2);

        // LIST3
        list3.add("1");
        list3.add("2");
        list3.add("3");

        System.out.println(list3.size());

        //  VECTOR
        l2.add(1);
        l2.add(4);

        System.out.println(l2);
    }
}