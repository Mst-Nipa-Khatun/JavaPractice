
package AnisulPractice;
import java.text.DecimalFormat;


public class DecimalFormatDemo {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("0.00");
        double x = 2.4683468;
        System.out.println("X is : "+d.format(x));
    }
}
