package Recursion;

public class Print1A {

    public static void main(String[] args){
        int A = 9;
        //printAll(A,-1);
        prints(A);
    }

    public static void prints(int A){
        if(A==1){
            System.out.print(A+" ");
            System.out.println();
            return;
        }


        //main logic
        System.out.print(A+" ");
        prints(A-1);
        
    }

    public static void printAll(int A, int value){
        if(value == A-1)
        {
            
            return;
        }
        value = value+1;
        System.out.println((A-value)+" ");
        printAll(A,value);
        
    }

    // private static void solve(int A){
    //     printATo1(A,0);
    //     printATo1(A,1);
    //     printATo1(A,2);
    //     printATo1(A,3);
        
    // }

    // private static void printATo1(int A, int value)
    // {
    //     System.out.println(10-value);
    // }

    // private static void print9(int A,int value){
    //     System.out.println(10-value);
    // }
    // private static void print8(int A,int value){
    //     System.out.println(10-value);
    // }

    // private static void print1toA(int A){
    //     if(A == 1)
    //         {
    //             System.out.print(1+" ");
    //             return;
    //         }
    //         rint1toA(A-1);    
    //     System.out.print(A+" "); 
        
    // }
}
