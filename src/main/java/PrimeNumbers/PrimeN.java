package PrimeNumbers;

import static java.lang.StrictMath.sqrt;

public class PrimeN {
    public static boolean isPrime(int m){
        for (int i = 2; i <= sqrt(m); i++) {
            if (m % i == 0)
                return false;
        }
        return true;
}
}
