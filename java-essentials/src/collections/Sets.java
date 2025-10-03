package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>(); // non ordered collection
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("lemon"); // don´t allow duplicates

        System.out.println(fruits);
        System.out.println("Have lemon? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("Number of elements after removing lemon: " + fruits.size());

        Set<String> moreFruit = Set.of("pear","raisin","cherry");
        // moreFruit.add("cranberry"); // crash
        // moreFruit.remove("pear"); // crash
        System.out.println(moreFruit);

    }

}
