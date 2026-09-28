class Solution {
    public String longestPalindrome(String s) {
        String longest = "";

        for (int start = 0; start < s.length(); start++) {

            for (int end = start; end < s.length(); end++) {

                String current = s.substring(start, end + 1);

                if (isPalindrome(current)) {

                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                }
            }
        }

        return longest;
    }

    public boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}