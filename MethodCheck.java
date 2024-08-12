package OOPConcept;

public class MethodCheck {

    public static void main(String[] args) {
        TeacherM1 obj = new TeacherM1();
        int result=obj.square(5);
        System.out.println("square of 5= "+result);

        TeacherM1 teacher = new TeacherM1("Nipa", "Female", 123345);
        // teacher.setInformation("Nipa","Female", 123345);
        teacher.displayInformation();

        TeacherM1 teacher2 = new TeacherM1();
        teacher.displayInformation();

    }
}
