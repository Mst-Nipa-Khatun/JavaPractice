
package Exception;

public class ExceptionDemo {
     public static void main(String[] args) {

        try {
            int[] a = new int[4];
            a[4] = 10;
        } catch (Exception e) {
            System.out.println("Exception is : " + e);
        } finally {
            System.out.println("last line ");
        }
    }
    
}
