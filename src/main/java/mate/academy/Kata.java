package mate.academy;

public class Kata {
    public static String firstNonRepeatingLetter(String s){
        if (s == null || s.isEmpty()) return "";
        java.util.Map<String, Integer> counts = new java.util.HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1).toLowerCase();
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            String originalChar = s.substring(i, i + 1);
            String lowerChar = originalChar.toLowerCase();
            if (counts.get(lowerChar) == 1) {
                return originalChar;
            }
        }
        return "";
    }
}