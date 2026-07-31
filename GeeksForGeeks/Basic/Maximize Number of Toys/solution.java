import java.util.Arrays;

class Solution {
    public int maxToys(int arr[], int k) {
        Arrays.sort(arr);

        int count = 0;

        for (int price : arr) {
            if (price <= k) {
                k -= price;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}