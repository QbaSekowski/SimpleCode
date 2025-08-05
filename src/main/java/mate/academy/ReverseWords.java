package mate.academy;

public class ReverseWords{

    public static String reverseWords(String str){
        String[] words = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
