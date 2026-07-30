// Title: Multiply Strings
            // Difficulty: Unknown
            // Language: Java
            // Link: https://leetcode.com/problems/multiply-strings/

class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] res = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';

            for (int j = n - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int mul = d1 * d2;

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = mul + res[p2];
