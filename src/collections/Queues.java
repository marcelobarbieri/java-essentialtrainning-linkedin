package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue<String> fruits = new LinkedList<>();

        System.out.println("Adding elements...");
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits);

        System.out.println("Adding one more element, lemon...");
        fruits.add("lemon");
        System.out.println(fruits);

        System.out.println("Removing the first element...");
        var removed = fruits.remove(); // remove the first element
        System.out.println("Fruit removed: " + removed);
        System.out.println(fruits);

        System.out.println("Bring the element without remove that...");
        System.out.println("Head of queue: " + fruits.peek());
        System.out.println(fruits);
    }

}
