package mate.academy;

import java.math.BigInteger;

public class BinaryScore {
    public static BigInteger score (BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }
        int bitLength = n.bitLength();
        return BigInteger.ONE.shiftLeft(bitLength).subtract(BigInteger.ONE);
    }
}
