package mate.academy;

import java.util.*;

class Solution {
    public static String solve(String[] arr) {
        Set<Integer> set = new HashSet<>();
        for (String s : arr) {
            String[] p = s.split(":");
            int h = Integer.parseInt(p[0]);
            int m = Integer.parseInt(p[1]);
            set.add(h * 60 + m);
        }
        List<Integer> times = new ArrayList<>(set);
        Collections.sort(times);
        int fullDay = 24 * 60;
        int maxSilent = 0;
        for (int i = 1; i < times.size(); i++) {
            int diff = times.get(i) - times.get(i - 1);
            maxSilent = Math.max(maxSilent, diff - 1);
        }
        int wrapDiff = fullDay - times.get(times.size() - 1) + times.get(0);
        maxSilent = Math.max(maxSilent, wrapDiff - 1);
        int hh = maxSilent / 60;
        int mm = maxSilent % 60;
        return String.format("%02d:%02d", hh, mm);
    }
}
