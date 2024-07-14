
package AnisulPractice;

import java.util.Scanner;


public class ArmstrongFromInput {
    public static void main(String[] args) {
       try (Scanner input=new Scanner(System.in))
       {
         int temp,r,sum=0;
        System.out.print("Enter start Number: ");
        int m= input.nextInt();

        System.out.print("Enter ending Number: ");
        int  n = input.nextInt();
        
        int count=0;
        for(int i=m;i<=n;i++)
        {
        temp=i;
        while(temp!=0)
        {
           r=temp%10;
           sum=sum+r*r*r;
           temp/=10;
        }
        if(i==sum)
        {
            System.out.println("Armstrongs number " + i);
            count++;
        }
       
       }
       System.out.println("Total Armstrong : "+count);

    }}
    
}
