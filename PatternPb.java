
package AnisulPractice;

import java.util.Scanner;


public class PatternPb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter line number: ");
        n=input.nextInt();
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
