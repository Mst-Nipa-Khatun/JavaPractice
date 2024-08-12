
package ThisKeyword;


public class PersonThisKeyword {
    String name;
    int age;
    String hairColor;
    
    PersonThisKeyword(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    PersonThisKeyword(String name,int age ,String HairColor)
    {
       this(name,age);
        this.hairColor=HairColor;
    }
    
    
    void displayInformation()
    {
        System.out.println("Name:"+name);
                System.out.println("Age:"+age);
        String HairColor = null;
                                System.out.println("Haircolor:"+HairColor);


    }
}
