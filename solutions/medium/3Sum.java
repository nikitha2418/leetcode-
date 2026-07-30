// Title: 3Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/3sum/

                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return res;        
    }
}
