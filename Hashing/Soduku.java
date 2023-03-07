package Hashing;

public class Soduku {
    public static void main(String[] args)
    {
        // String[] A = {
        //     "63..7....", 
        //     "6..195...", 
        //     ".98....6.", 
        //     "8...6...3", 
        //     "4..8.3..1", 
        //     "7...2...6", 
        //     ".6....28.", 
        //     "...419..5", 
        //     "....8..79"};
        String[] A = {"....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......"};
        int length = A[0].length();    
        for(int i = 0; i < A.length-1; i++)
        {
            int j = 0;
            while(A[i].charAt(j)!='.' && A[i+1].charAt(j) != '.' && A[i].charAt(j) == A[i+1].charAt(j))
            {
                if(A[i].charAt(j) == A[i+1].charAt(j))
                    {
                        System.out.println("False");
                        return;
                    }
                j++;
            }
        }   
        System.out.println("True"); 
    }
    
}
