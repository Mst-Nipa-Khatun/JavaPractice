package String_Package;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class TimeDemo {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println(formattedTime);
    }
}
