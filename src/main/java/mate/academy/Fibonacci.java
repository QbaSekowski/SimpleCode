package mate.academy;

public class Fibonacci {
    public static int getFibNumb(int n) {
        return (int) fibonacci(n);
    }

    private static long fibonacci(int n) {
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = (fib[i-1] + fib[i-2]) % 10;
        }
        return fib[n];
    }
}