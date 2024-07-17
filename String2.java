
package String_Package;


public class String2 { 
    public static void main(String arg[]){
    String s1="Nipa";
    String s2=" Sheikh";
    
    String Fullname=s1+s2;
    System.out.println(" Fullname= "+Fullname);
    
       String fullname=s1.concat(s2);
    System.out.println(" Fullname= "+fullname);
            
    String uppername=s1.toUpperCase();
        System.out.println("Uppername:"+uppername);
        
          String Lowername=s1.toLowerCase();
        System.out.println("Lowername:"+Lowername);
        
        boolean start=s1.startsWith("N");
        System.out.println("Start="+start);
         boolean end=s2.endsWith("h");
        System.out.println("End="+end);
        
      
}
}