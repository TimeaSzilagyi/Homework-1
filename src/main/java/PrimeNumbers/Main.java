package PrimeNumbers;

import static PrimeNumbers.PrimeN.isPrime;

public class Main {
    public static void main(String[] args){
        
        int j;
        int n;
        n = 100;

        for (j = 2; j <=n; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
}
}
