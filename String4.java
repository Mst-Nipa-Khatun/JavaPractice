package String_Package;

public class String4 {

    public static void main(String[] args) {
        String s1 = "Nipa loves you";
        System.out.println("s1  = " + s1);

        String s2 = s1.replace("i","e");
        System.out.println("s1 value replace = " + s2);

        String[] s3 = s1.split(" ");
        for (String x : s3) {
            System.out.println(x);
        }

    }
}
