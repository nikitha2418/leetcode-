class Solution {
    public static double avgUsingStreams(int[] arr) {
        // Your code here
        double sum = 0;
        for(int i:arr){
            sum+=i;
        }
        double avg = sum / arr.length;
        return avg;

        // Use stream().average().getAsDouble()
        // Just return and don't typecase anything.
    }
}