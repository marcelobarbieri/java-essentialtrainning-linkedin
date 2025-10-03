package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<String,Integer> fruitCalories = new HashMap<>();

        System.out.println("1. Adding elements...");
        fruitCalories.put("apple",95);
        fruitCalories.put("lemon",20);
        fruitCalories.put("banana",105);
        fruitCalories.put("orange",45);
        System.out.println(fruitCalories);

        System.out.println("2. Adding lemon again, overriding existing value...");
        fruitCalories.put("lemon",17);
        System.out.println(fruitCalories);

        System.out.println("3. Adding lemon again, if absent...");
        fruitCalories.putIfAbsent("lemon",17);
        System.out.println(fruitCalories);

        System.out.println("4. Banana value...");
        System.out.println("banana: " + fruitCalories.get("banana"));

    }

}
