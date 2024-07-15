
package com.mycompany.arraypractice;

import java.util.Scanner;


public class MaximumMinimum {
   
      public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double[] number=new double[7];
        double sum= 0;
        
        System.out.print("Enter numbers:");
        for(int i=0;i<number.length;i++) //input newar jonno
        {
            number[i]=input.nextDouble();
            
        }
        for(int i=0;i<number.length;i++)
        {
            sum=sum+number[i];
        }
          
          double avg=sum/number.length;
          System.out.println("The sum is:"+sum);
          System.out.println("The Average is:"+avg);
          
          double max=number[0];
          double min= number[0];
          
          for(int i=1;i<number.length;i++)
          {
             if(max<number[i])
             {
                max=number[i];
             }
             if(min>number[i])
             {
                min=number[i];
             }
     
          }
          System.out.println("Maximum"+max);
              System.out.println("Minimum:"+min);
        
       
    }
}
   
    

