package mate.academy;

import java.math.BigInteger;

public class BinarySxore {
    public static BigInteger sxore (BigInteger n) {
        BigInteger four = BigInteger.valueOf(4);
        BigInteger two = BigInteger.valueOf(2);
        BigInteger mod = n.mod(four);
        if (mod.equals(BigInteger.ZERO)) {
            return n;
        } else if (mod.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else if (mod.equals(two)) {
            return n.add(BigInteger.ONE);
        } else {
            return BigInteger.ZERO;
        }
    }
}
