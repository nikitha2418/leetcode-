// Title: Maximum Average Subarray I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-average-subarray-i/


        int maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; 
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}

 
