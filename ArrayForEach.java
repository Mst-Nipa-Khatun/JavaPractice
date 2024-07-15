
package com.mycompany.arraypractice;


public class ArrayForEach {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,60,70,80,90};
        int sum =0;
    
    for( int X : num){
        System.out.println(X+" ");
        sum = sum+X;
    }
        System.out.println("sum: "+sum);
  }
}
