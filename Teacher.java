package String_Package;

public class Teacher {
    private String name;
    private double age;
    private String id;
    private String designation;
    private String[] phones;
    private String[] address;

    public String getName() {
        return this.name;
    }

    public void setName(String pName) {
        this.name = pName;
    }
    
    public void setNameAgePhones(String nName,double aAge,String[] pPhones)
    {
        this.name=nName;
        this.age=aAge;
        this.phones=pPhones;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double pAge) {
        this.age = pAge;

    }

    public String getID() {
        return this.id;
    }

    public void setID(String pID) {
        this.id = pID;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String pDesignation) {
        this.designation = pDesignation;
    }

    public String[] getPhones() {
        return this.phones;
    }

    public void setPhones(String[] pPhones) {
        this.phones = pPhones;
    }

    public String[] getAddress() {
        return this.address;

    }

    public void setAddress(String[] aAddress) {
        this.address = aAddress;
    }

    @Override
    public String toString() {
        return name+" "+age+" "+ phones[0]+","+phones[1]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
