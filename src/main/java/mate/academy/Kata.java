package mate.academy;

import java.util.ArrayList;
import java.util.List;

public class Kata{
    public static int[] capitals(String s){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}