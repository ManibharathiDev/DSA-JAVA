package Arrays;

import java.util.FormatterClosedException;

public class FractionOperation {
    public static void main(String[] args)
    {
        Fraction A = new Fraction(5,8);
        Fraction B = new Fraction(3,12);
        Fraction z = A.add(B); 
        System.out.println("Num =>"+z.numerator);
        System.out.println("De =>"+z.denominator);
        Fraction y = A.subtract(B);
        System.out.println("Num =>"+y.numerator);
        System.out.println("De =>"+y.denominator);
        Fraction m = A.multiply(B); // 8/15
        System.out.println("Num =>"+m.numerator);
        System.out.println("De =>"+m.denominator);
    }
}

class Fraction
{
    int numerator;
    int denominator;

    Fraction(){}

    Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    Fraction add(Fraction a){
		
        Fraction res = new Fraction();
        if(denominator == a.denominator)
        {
            res.numerator = numerator+a.numerator;
        }
        else{
            int lcm = lcm(denominator, a.denominator);
            res.denominator = lcm;
            res.numerator = (numerator*(lcm/denominator)) + (a.numerator*(lcm/a.denominator));
        }

        return res;
			
	}
		
	Fraction subtract(Fraction a){
		// Complete the function
        Fraction res = new Fraction();

        int lcm;

            if((denominator%a.denominator)==0){
                lcm=denominator;
            }else if((a.denominator%denominator)==0){
                 lcm=a.denominator;
            }else {
                lcm=a.denominator*denominator;
            }

            int finalNumerator= (((numerator)*((lcm)/denominator)) - ((a.numerator) *((lcm)/a.denominator)));
            int finalDenominator=lcm;
           
            //While seding send absolute values fo GCD ,parameters should be postive .
            int gcd=hcf(Math.abs(finalNumerator),Math.abs(finalDenominator));
            finalNumerator=finalNumerator/gcd;
            finalDenominator=finalDenominator/gcd;  
            res.numerator = finalNumerator;
            res.denominator = finalDenominator;
          //  System.out.println("finalNumerator :"+finalNumerator);
          //  System.out.println("finalDenominator :"+finalDenominator);

        
        // if(denominator == a.denominator)
        // {
        //     if(numerator>a.numerator)
        //         res.numerator = numerator-a.numerator;
        //     else
        //         res.numerator = a.numerator-numerator;    
        // }
        // else{
        //     int lcm = lcm(denominator, a.denominator);
        //     res.denominator = lcm;
        //     int first = a.numerator*(lcm/a.denominator);
        //     int second = numerator*(lcm/denominator);
        //     if(first > second)    
        //          res.numerator = second - first;
        //     else
        //         res.numerator = first - second;     
        // }

        return res;
			
	}
		
	Fraction multiply(Fraction a){
		// Complete the function
        Fraction res = new Fraction();
        
        int n1 = numerator*a.numerator;
        int d1 = denominator*a.denominator;
        int hcf = hcf(n1, d1);
        res.numerator = n1/hcf;
        res.denominator = d1/hcf;
        return res;
			
	}



    int lcm(int n1, int n2)
    { 
        int lcm = (n1 > n2) ? n1 : n2;
        while(true) 
        {
        if( lcm % n1 == 0 && lcm % n2 == 0 ) {
            return lcm;
        }
        ++lcm;
        }
    }

    int hcf(int n1, int n2)
    {
        int hcf = 0;

        if(n1 == 0 && n2 == 0)
            return 1;

        for(int i = 1; i <= n1 || i <= n2; i++) {
            if( n1%i == 0 && n2%i == 0 )
            hcf = i;
         }
         return hcf;
    }
}
