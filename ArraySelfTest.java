
package com.mycompany.arraypractice;

import java.util.Scanner;
public class ArraySelfTest {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num= new int[4][5];
        
        int k=1;
        for (int row =0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
              num[row][col] =k;
              k+=2;
            }
        }
        
        for (int row =0; row < 4; row++) {
            for (int col = 0; col <  5; col++) {
                System.out.print(" "+num[row][col]);
            }
            System.out.println();
        }
        
    }
}
    
