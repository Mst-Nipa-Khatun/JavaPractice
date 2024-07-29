
package String_Package;


public class StringSelfTest {
    
    public static void main(String arg[]){
    String s1=null;
    String s2=" Sheikh";
    //    boolean b=s1.isEmpty();
//        System.out.println("S1 is empty="+b);
     
        if(s1==null || s1.isEmpty()){
            System.out.println("no value");
        }else{
            System.out.println("have some value");
        }
    String[] names={"nipa","kib","adda"};
            for(String x: names)
            {
                System.out.println(x);
            }
    }
    
}
