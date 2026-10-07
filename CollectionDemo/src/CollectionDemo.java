import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Rahul");

        System.out.println("ArrayList:");
        System.out.println(names);


        // 2. LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);
        numbers.addLast(40);

        System.out.println("\nLinkedList:");
        System.out.println(numbers);


        // 3. HashSet
        HashSet<String> cities = new HashSet<>();

        cities.add("Nashik");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Mumbai");   // Duplicate is ignored

        System.out.println("\nHashSet:");
        System.out.println(cities);


        // 4. TreeSet
        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(75);
        marks.add(90);
        marks.add(60);
        marks.add(85);

        System.out.println("\nTreeSet (Sorted):");
        System.out.println(marks);


        // 5. HashMap
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Priya");

        System.out.println("\nHashMap:");
        System.out.println(students);

        System.out.println("Student with ID 102: " + students.get(102));


        // 6. Queue
        Queue<String> queue = new LinkedList<>();

        queue.add("Person 1");
        queue.add("Person 2");
        queue.add("Person 3");

        System.out.println("\nQueue:");
        System.out.println(queue);

        System.out.println("Removed from Queue: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}
