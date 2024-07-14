/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnisulPractice;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0,num,temp,r;
        System.out.print("Enter any Number:");
        num = input.nextInt();
        temp = num ;
        while(temp!= 0){
            r = temp % 10 ;
            sum = sum*10 + r ;
            temp = temp / 10 ;
        }
        System.out.println("Sum of the Didits is :  "+sum);
    }
    
}
