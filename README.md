# TriangleDemo

import java.util.Scanner;


public class DataType {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        Double base, height, area;
        
         System.out.println("Enter base: ");
         base= input.nextDouble();
         System.out.println("Enter lenght: ");
         height= input.nextDouble();
         
         area= 0.5* base* height;
         System.out.println("Area:"+area);
          }
         }

//Sum two input         
package com.mycompany.selfpractice;

import java.util.Scanner;


public class SumTwoNo {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num1 = input.nextInt();
        System.out.print("Enter End Number :");
        int num2 = input.nextInt();
        
                int sum = num1+ num2;
                System.out.println("Sum of Values:"+sum);
                
                
    }
}

