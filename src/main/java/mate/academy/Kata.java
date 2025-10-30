package mate.academy;

class Kata {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=10; i++) {
            sb.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
        }
        return sb.toString().trim();
    }
}