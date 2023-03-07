package BitManipulation;

public class KTHHigh {
    public static void main(String[] args)
    {
        // int A = 277;
        // long B = 887;
        int A = 4;
        long B = 3L;
       String value = "0";
         //int res = solve(B);
         System.out.println(res);
        
       
    }

    private static String solve(String val)
    {

        if(val == "0")
            return "01";
        else if(val == "1")    
            return "10";
            
        
        // //Assumption Print row
        // if(val == 0)
        // {
        //     return value.charAt((int) B)-'0';
        // }
        // char[] myValue = value.toCharArray();
        // String newValue = "";
        // for(int i = 0; i < myValue.length; i++)
        // {
        //     if(myValue[i] == '0')
        //         newValue +="01";
        //     else
        //         newValue += "10";    
        // }
        // val--;
        // System.out.println(newValue);
        // return solve(val, newValue,B);
        
    }
}
