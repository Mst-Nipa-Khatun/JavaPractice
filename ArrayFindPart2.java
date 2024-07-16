
package com.mycompany.arraypractice;


import java.util.Scanner;
public class ArrayFindPart2 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row = ");
        int row  = input.nextInt();
        int k = 0;
        
        for (int i = 1; i <=row; i++) 
        {
            for (int j = 1; j <=i; j++) 
            {
                System.out.print(" "+k);
                k++;
            }
            System.out.println("");
        }
    }
}

    

