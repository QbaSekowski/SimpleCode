package mate.academy;

public class Sequence{

    public static int[] reverse(int n){
        int[] result = new int[n];
        for (int i = n; i > 0; i--) {
            result[n - i] = i;
        }
        return result;
    }

}