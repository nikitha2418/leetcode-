// Title: Search in Rotated Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

                    start = mid + 1; // move right
                }
            } 
            // Right part is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // move right
                } else {
                    end = mid - 1; // move left
                }
            }
        }

        return -1;
    }
}
