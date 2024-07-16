
package com.mycompany.arraypractice;

import java.util.ArrayList;


public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("number1 : " + number1);

        number2.add(50);
        number2.add(60);
        number2.add(70);
        number2.add(80);
        System.out.println("number2 : " + number2);

        number3.addAll(number1);
        System.out.println("number3  : " + number3);
        
        System.out.println("Size number1:"+number1.size());
        System.out.println("Size number2:"+number1.size());
        System.out.println("Size number3:"+number1.size());

        boolean b = number1.equals(number2);
        System.out.println("number1 == number2 : " + b);
        
       boolean b1=number1.equals(number3);
        System.out.println("number1 == number3 : " + b1);
        
 
}
}