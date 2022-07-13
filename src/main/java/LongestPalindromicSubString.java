public class LongestPalindromicSubString {

    public String solution(String s) {
        if (s.length() < 2) {
            return s;
        }

        int longest = 0;
        String longestString = "";

        for (int i = 0; i < s.length(); ++i) {
            int mid1 = findPalindromeFromMid(s, i, i);
            int mid2 = findPalindromeFromMid(s, i, i + 1);

            int currentMid = Math.max(mid1, mid2);
            if (longest < currentMid) {
                int start = i - (currentMid - 1) / 2;
                int end = i + currentMid / 2;
                longest = end - start + 1;
                longestString = s.substring(start, end + 1);
            }
        }

        return longestString;
    }

    private int findPalindromeFromMid(String s, int start, int end) {
        boolean matched = false;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            --start;
            ++end;
            matched = true;
        }

        return matched ? (end - 1) - (start + 1) + 1 : 0;
    }
}
