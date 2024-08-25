
package AnisulPractice;

import java.util.LinkedList;

public class LinkedListDemo {
      public static void main(String[] args) {
        LinkedList<String> countryname = new LinkedList<String>();
        countryname.add("Pakistan");
        countryname.add("India");
        countryname.add("Bangladesh");
                countryname.addFirst("Japan");
        countryname.addLast("Uk");
                countryname.remove(3);



        for (String country : countryname) {
            System.out.println(country);
        }
}
}
