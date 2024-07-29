
package String_Package;


public class StringPalindrome {
    public static void main(String[] args) {
        
        String s1 = "121";
        StringBuffer sb = new StringBuffer(s1);
        
         sb.reverse().toString();
        if(s1.equals(sb)){
            System.out.println("Not Palindrome");
        }else{
            System.out.println("Palindrome");
        }
        
        
        
        
    }
    
    
}
