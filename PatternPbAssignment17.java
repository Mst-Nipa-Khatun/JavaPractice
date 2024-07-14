
package AnisulPractice;

import java.util.Scanner;


public class PatternPbAssignment17 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of N = ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
    }
}
