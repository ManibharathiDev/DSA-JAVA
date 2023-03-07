public class CheckBit {
    public static void main(String[] args){
        int A = 5;
        int i = 2;
        if(((A>>i)&1) == 1){
            System.out.println("ON");
        }
        else{
            System.out.print("OFF");
        }
    }
}
