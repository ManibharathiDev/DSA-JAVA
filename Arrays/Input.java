package Arrays;

import java.util.Scanner;

public class Input {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Principle Amount");
            int p = sc.nextInt();

            System.out.println("Enter the rate of interest");
            int r = sc.nextInt();

            System.out.println("Enter the time");
            int t = sc.nextInt();

            int si = (p*r*t);
            System.out.println(si);

            
        }
}
