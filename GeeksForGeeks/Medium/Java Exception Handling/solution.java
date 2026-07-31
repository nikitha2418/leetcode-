class Solution {
    public int findMin(int a, int b) {
        int c1 = a + b;
        int c2 = a - b;
        int c3 = a * b;
        int c4 = (b != 0) ? a / b : Integer.MAX_VALUE;

        int min = c1;

        if (c2 < min) min = c2;
        if (c3 < min) min = c3;
        if (c4 < min) min = c4;

        return min;
    }
}

class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.findMin(5, 10)); 
    }
}

