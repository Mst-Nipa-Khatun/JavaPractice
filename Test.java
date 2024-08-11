
package Inheritance;


public class Test {
    public static void main(String[] args) {
        Person p1=new Person();
        Teacher t1=new Teacher();
        
        t1.name="Nipa";
        t1.age=25;
        t1.qualification="BSc in CSE\n";
        
        t1.displayInformation();
        
        p1.name="Kibria";
        p1.age=28;
        
        p1.displayInformation();

        
    }
    
}
