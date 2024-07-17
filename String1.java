
package String_Package;


public class String1 {
    public static void main(String[] args) {
        String s1 = "Nipa";
        String s2 = new String("Nipa");
        System.out.println("s1  = "+s1);
        System.out.println("s2  = "+s2);
        
        int length = s1.length();
        System.out.println("Length of s1 : "+length);
        
        int len = s2.length();
        System.out.println("Length of s2 : "+len);
        
        if(s1.equals(s2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
        System.out.println();
        if(s1.contains(s2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
        
        /*if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        } */
        boolean con = s1.contains("Nipa");
        System.out.println(con);
        
        boolean b = s1.isEmpty();
        System.out.println(b);
    }
}
