package Oops;

public class Parent {
    public int famId;
    public String familyName;

    public void setFamilyName(int famId,String familyName)
    {
        this.famId = famId;
        this.familyName = familyName;
    }
    
    public void printFamilName()
    {
        System.out.println("Family Details");
        System.out.println(famId);
        System.out.println(familyName);
        
    }
}
