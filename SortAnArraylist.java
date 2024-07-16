
package com.mycompany.arraypractice;

import java.util.ArrayList;
import java.util.Collections;


public class SortAnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(23);
        number.add(-56);
        number.add(34);
        number.add(90);
        System.out.println("Before sorting number : " + number);

        Collections.sort(number);
        System.out.println("Ascending order : " + number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Descending order : " + number);
    }
}

