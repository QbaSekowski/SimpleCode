package mate.academy;

public class Kata {
    public static String stringChallenge(String[] strArr) {
        if (strArr == null || strArr.length < 2) return "";
        String s = strArr[0];
        String t = strArr[1];
        if (s.length() == 0 || t.length() == 0) return "";

        // Liczba wymaganych znaków (ASCII zwykłe małe litery ale działamy ogólnie na 256)
        int[] need = new int[256];
        for (char c : t.toCharArray()) need[c]++;

        int required = t.length(); // ile znaków łącznie musimy "zdobyć" (uwzględniając powtórzenia)
        int have = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        int[] window = new int[256];

        for (int right = 0; right < s.length(); right++) {
            char rc = s.charAt(right);
            window[rc]++;
            // jeśli po dodaniu rc nadal jest potrzeba tego znaku (window <= need) to zwiększamy have
            if (need[rc] > 0 && window[rc] <= need[rc]) {
                have++;
            }

            // gdy mamy wszystkie wymagane znaki, próbujemy zmniejszać okno z lewej
            while (have == required) {
                // aktualizuj odpowiedź
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                // spróbuj usunąć znak z lewej
                char lc = s.charAt(left);
                window[lc]--;
                if (need[lc] > 0 && window[lc] < need[lc]) {
                    have--; // straciliśmy wymagane wystąpienie
                }
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(minLeft, minLeft + minLen);
    }
}