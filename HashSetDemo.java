package AnisulPractice;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> fruitname = new HashSet<String>();

        fruitname.add("apple");
        fruitname.add("orange");
        fruitname.add("banana");

        for (String fruit : fruitname) {
            System.out.println(fruit);
        }
        fruitname.remove("apple");
        System.out.println(fruitname);
        fruitname.clear();
        System.out.println(fruitname);
        boolean value=fruitname.isEmpty();
        System.out.println(value);

    }
}
