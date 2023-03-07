package Oops;

public class AbstractExample {
    public static void main(String[] args)
    {
        DataAbstract dataAbstract = new DataAbstract();
        dataAbstract.getMyDetails();
    }
}

class DataAbstract extends MyAbstract{

    @Override
    void getMyDetails() {
        System.out.println("This is abstract method");
    }
    
}
