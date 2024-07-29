
package String_Package;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {
        public static void main(String[] args) {
            Date d= new Date();
            //System.out.println(d);
            
            DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
            String CurrentDate= df.format(d);
            System.out.println("Current Date:"+CurrentDate);
        }
}
