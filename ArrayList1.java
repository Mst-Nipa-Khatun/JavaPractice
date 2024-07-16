
package com.mycompany.arraypractice;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        System.out.println("number : " + number);
        
        System.out.println("Size number:"+number.size());

       /* number.remove(3);
        System.out.println(" After Removing "+number); */
        
       /* number.removeAll(number);
        System.out.println(" After all Removing "+number); */
       
      /* number.clear();
        System.out.println("Clear: "+number); */
      
      boolean b= number.isEmpty();
        System.out.println("empty: "+b); 
     
    boolean c=number.contains(30);
        System.out.println("contains: "+c); 
    
    int d= number.indexOf(40);
        System.out.println("Index of 40 is:"+d);
    
    
        number.set(3, 60);
        System.out.println("Set a value:"+number);
        
        int x=number.get(0);
        System.out.println("Index 0= "+x);
        
      
      
      
        
    }
}
