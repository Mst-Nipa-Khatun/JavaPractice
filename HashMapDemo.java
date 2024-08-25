
package AnisulPractice;
import java.util.HashMap;

public class HashMapDemo {
        public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<Integer, String>();
        student.put(14, "Nishat");
        student.put(15, "Ritu");
        student.put(16, "Nipa");
        System.out.println(student.get(14));
        System.out.println(student.get(15));
        System.out.println(student.get(16));
    }

}
