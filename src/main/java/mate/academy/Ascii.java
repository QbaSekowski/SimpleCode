package mate.academy;

public class Ascii {
    public static int getWeight(String name){
        int totalWeight = 0;
        if (name == null || name.isEmpty()) {
            return 0;
        }
        for (char ch : name.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                totalWeight += Character.toUpperCase(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                totalWeight += Character.toLowerCase(ch);
            }
        }
        return totalWeight;
    }
}
