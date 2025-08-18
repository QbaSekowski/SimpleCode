package mate.academy;

import java.util.LinkedList;
import java.util.List;

public class SimplePrimeStreaming {
    public static String solve(int a, int b) {
        StringBuilder sb = new StringBuilder();
        List<Long> listOfPrimes = new SimplePrimeStreaming().nthPrimes(a + b);
        for (Long prime : listOfPrimes) {
            sb.append(prime);
            if (sb.length() >= a + b) {
                break;
            }
        }
        return sb.substring(a, a + b);
    }

    private List<Long> nthPrimes(int n) {
        List<Long> listOfPrimes = new LinkedList<>();
        int counter = 0;
        long currentNumber = 2;
        while (counter < n) {
            if (isPrime(currentNumber)) {
                listOfPrimes.add(currentNumber);
                counter++;
            }
            currentNumber++;
        }
        return listOfPrimes;
    }

    private boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

