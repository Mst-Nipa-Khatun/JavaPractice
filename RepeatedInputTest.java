
package com.mycompany.arraypractice;


public class RepeatedInputTest {
    public static void main(String[] args) {      
          
        int [] arr = new int [] {1,2,2,3,4,4,7,8,8,9};   
          
        System.out.println("Repeated Elements: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
    
}
