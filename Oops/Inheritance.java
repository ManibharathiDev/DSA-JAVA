package Oops;


public class Inheritance {
    public static void main(String[] args)
    {
        Generation generation = new Generation();
        generation.setCurrentYear(2023);
        System.out.println(generation.getCurrentYear());
        generation.setFamilyName(1, "Good Family");
        generation.printFamilName();
       
        
    }
}

class Generation extends Parent{
    int currentYear;



    public int getCurrentYear() {
        return currentYear;
    }

    
    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
 
}


