public class Increment {
    public static void main(String[] args){
        int a = 10;
        int b = a++ + a++;
        System.out.println("A is=>"+a);
        System.out.println("B is=>"+b);

        int c = 10;
        int d = ++c + ++c;
        System.out.println("C is =>"+c);
        System.out.println("D is =>"+d);

        int e = 10;
        int f = ++e + e++;
        System.out.println("E is =>"+e);
        System.out.println("F is =>"+f);

        int g = 10;
        int h = g++;



    }
}
