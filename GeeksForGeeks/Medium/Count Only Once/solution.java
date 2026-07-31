class Solution {
    public static int countOnce(int arr[]) {
        // Your code here
        int count = 0, j=-1;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==j){
                continue;
            }
            j = arr[i];
            count++;
        }
        return count;
    }
}