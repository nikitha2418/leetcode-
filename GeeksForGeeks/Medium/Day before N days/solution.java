class Solution {
    public int dayBefore(int d, int n) {
        int rem = n % 7;
        while(rem > 0){
            if(d == 0)
                d = 6;
            else
                d--;
            rem--;
        } 
        return d;   
        }
}