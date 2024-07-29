
package String_Package;


public class EncapsulationExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Nipa");
        teacher.setAge(500.5);
        
        String[] phoneList =new String[2];
        phoneList[0] = "01776776567";
        phoneList[1] = "098766565555";
       
        
        teacher.setPhones(phoneList);
        
        
        System.out.println(teacher.toString());
        
        
        
    }
}
