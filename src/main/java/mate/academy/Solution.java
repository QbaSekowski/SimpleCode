package mate.academy;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int longestSubstringLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (seen.contains(c)) {
                    break;
                }
                seen.add(c);
                longestSubstringLength = Math.max(longestSubstringLength, j - i + 1);
            }
        }
        return longestSubstringLength;
    }
}