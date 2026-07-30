// Title: Longest Palindromic Substring
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-palindromic-substring/


    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
