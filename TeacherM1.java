package OOPConcept;

public class TeacherM1 {
 
    String name, gender;
    int phone;
    
    int square(int value)
    {
        return value*value;
    }
    
    //constrauctor
    TeacherM1()
    {
        System.out.println("No Value \n");
    }
    
     TeacherM1(String m, String n, int ph) {
        name = m;
        gender = n;
        phone = ph;
//parameter
//        void setInformation(String m, String n, int ph) {
//        name = m;
//        gender = n;
//        phone = ph;
    }

    void displayInformation() {
        System.out.println("Name: " + name+  " \nGender: " +gender+" \n"+ "phone: "+phone+"\n ");
      // System.out.println("gender: " + gender);
       //System.out.println("phone: " + phone);

    }

}
 