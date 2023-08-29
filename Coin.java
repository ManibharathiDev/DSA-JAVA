public class Coin{
    public static void main(String[] args) {
        int A = 12656;
        int result = A;
        int count = 0;
        count += result%5;
        int resCount = result-count;
        int div = 5;
        int total = count;
        while(total != result)
        {
            int divs = resCount / div;
            
            count += divs%5;
            total += ((divs%5)*div);
            div = div*5;
        }
        System.out.println(count);
    }
}