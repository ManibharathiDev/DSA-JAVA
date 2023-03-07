package Oops;

//Example of Class, Object and Data Encapsulation
public class Employee {
    public static void main(String[] args)
    {
        Details details_1 = new Details(); // Object Cretion , details_1 is a object of Details class
        details_1.setId(1);
        details_1.setEmpName("Gopal");
        details_1.setEmpDept("Software Development");

        System.out.println(details_1.getId());
        System.out.println(details_1.getEmpName());
        System.out.println(details_1.getEmpDept());

        printEmpDetails(details_1.getId(), details_1.getEmpName());
        printEmpDetails(details_1.getId(), details_1.getEmpName(),details_1.getEmpDept());

    }

    //Method Overloading - Polymorphism - Same Method name and act differently
    /**
     * 
     * @param id
     * @param empName
     */
    private static void printEmpDetails(int id, String empName)
    {
        System.out.println(id);
        System.out.println(empName);
    }

    private static void printEmpDetails(int id, String empName, String empDept)
    {
        System.out.println(id);
        System.out.println(empName);
        System.out.println(empDept);
    }

}

//class
class Details{

    //Attributes or Properties
    int id;
    String empName;
    String empDept;

    //Data Encapsulation

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpDept() {
        return empDept;
    }
    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    
}
