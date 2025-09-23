package mate.academy;

public class Solution{
    public static int oddOne(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
}
