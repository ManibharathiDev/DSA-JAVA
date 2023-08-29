import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = Integer.MIN_VALUE;
        int n  = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            int current = sc.nextInt();
            MAX = Math.max(current, MAX);
        }

        System.out.println(MAX);
    }
}
