package mate.academy;

public class Solution{

    public static String kata(String[] array, String str) {
        for (int i=0;i<array.length;i++)
            if (str.equals(array[i])) return""+i;
        return"Not found";
    }

}