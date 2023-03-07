package String;

public class IsAlphaNum {
    public static void main(String[] args){
        char[] A = {'S', '&', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        for(int i = 0; i < A.length; i++)
        {
            
            if((A[i] >= 48 && A[i] <= 57) || (A[i] >= 65 && A[i] <= 90) || (A[i] >= 97 && A[i] <= 122)){
                
            }
            else{
                System.out.println("No Alphanumeric");
                return;
            }
        }
        System.out.println("All Alphanumeric");
    }
}
