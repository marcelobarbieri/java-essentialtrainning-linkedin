package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(); // are ordered

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits);

        fruits.set(2,"grape"); // update
        System.out.println(fruits);
        System.out.println(fruits.get(2));

        fruits.add("lemon"); // allow duplicates
        System.out.println(fruits);
        System.out.println("Index of first lemon: " + fruits.indexOf("lemon"));
        System.out.println("Index of last lemon: " + fruits.lastIndexOf("lemon"));

        fruits.remove(4);
        System.out.println(fruits);


        List<String> moreFruit = List.of("cherry","cranberry","plum");
        System.out.println(moreFruit);

    }

}
