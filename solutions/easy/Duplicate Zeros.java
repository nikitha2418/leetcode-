// Title: Duplicate Zeros
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/duplicate-zeros/

        int i = n - 1;
        int j = n + countZeros - 1;

        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                j--;
                if (j < n) arr[j] = 0;
            }
            i--;
            j--;
        }
    }
}
