class IncDec{
    public static void main(String[] args) {
        int a = 10;
        int c = ++a;

        int d = 10;
        int e = ++d + ++d;

        //int f = d++ + d++ + d++;

        //System.out.println(f);


        System.out.println(d);
        System.out.println(e);

        System.out.println(a);
        System.out.println(c);
    }
}