
package Polymorphism;


public class PolymorphismTest {
    public static void main(String[] args) {
        PersonPolymorphism p1= new PersonPolymorphism();
        p1.display();
        
        p1= new TeacherPolymorphism();
        p1.display();
        
        p1=new StudentPolymorphism();
        p1.display();
    }
}
