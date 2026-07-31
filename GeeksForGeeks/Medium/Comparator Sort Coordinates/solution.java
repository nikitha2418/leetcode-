class Solution {
    public static void coordinatesSort(Point[] arr) {
        // Your code here
        Arrays.sort(arr, (a1, a2)-> (a1.x==a2.x) ? (a1.y-a2.y) : (a1.x-a2.x));
        return;
        // Use lambda expressions to sort the array in the required way
    }
}