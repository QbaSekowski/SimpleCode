package mate.academy;

class BeforeAfterPrimes {

    public static long[] primeBefAft(long num) {
        long[] result = new long[2];
        long possibleNumber = num - 1;
        while (!isPrime(possibleNumber)) {
            possibleNumber--;
        }
        result[0] = possibleNumber;
        possibleNumber = num + 1;
        while (!isPrime(possibleNumber)) {
            possibleNumber++;
        }
        result[1] = possibleNumber;
        return result;
    }

    private static boolean isPrime(long num) {
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}