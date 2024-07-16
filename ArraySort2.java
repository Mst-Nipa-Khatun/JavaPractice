
package com.mycompany.arraypractice;

import java.util.Arrays;

public class ArraySort2 {
        public static void main(String[] args) {

    String[] names = {"nipa","kibria","Jakaria","Mahmud","Aria"};
    Arrays.sort(names);
  
        System.out.println("Ascending:");
     
        for(int i=0;i<5;i++)
    {
        System.out.print( " " +names[i]); 
    }
    System.out.println(" ");
    System.out.println( " Decending:"); 
        for(int i=4;i>=0;i--)
  {
      System.out.print(" "+names[i]);
  }
    
    
}
}