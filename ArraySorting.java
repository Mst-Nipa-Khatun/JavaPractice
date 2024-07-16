
package com.mycompany.arraypractice;

import java.util.Arrays;
public class ArraySorting {
    public static void main(String[] args) {
        int[] number={10,-2,3,8,5};
        Arrays.sort(number);
        
        System.out.print("Ascending:");
        for(int i=0;i<5;i++)
        {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        System.out.print("Descending:");
        for(int i=4;i>=0;i--)
        {
            System.out.print(" "+number[i]);
        }
    }
    
}
