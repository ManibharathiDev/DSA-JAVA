package Recursion;

import java.util.Scanner;

public class Reversing {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Test");
        String oString = myObj.nextLine();
        //CooSystem.out.println(oString);
        char[] s = oString.toCharArray();
        int Si = s.length-1;
        printReverse(s,Si);
    }

    public static void printReverse(char[] s, int e)
    {
        if(e<0)
            return;
        System.out.print(s[e]);
        e--;
        printReverse(s, e);    
    }

    public static void printName(String name){
        System.out.println("User Name is =>"+name);
    }
}
