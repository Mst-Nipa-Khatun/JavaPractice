
package String_Package;


public class String3 {
    public static void main(String[] args) {
        String A = "  I Love My Country  ";
        System.out.println(A);
        
        String B = A.trim();
        System.out.println(B);
        
        char ch = A.charAt(7);
        System.out.println("char is   : "+ch);
        
        int value = A.codePointAt(5);
        System.out.println("value is : "+value);
        
        int position = A.indexOf("Country");
        System.out.println("Position is : "+position);
        
        position = A.lastIndexOf('y');
        System.out.println("Last Position is : "+position);
        
        
    }
    
}
