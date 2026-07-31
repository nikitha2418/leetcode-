class Solution {
	public static int binarySearchAL(ArrayList<Integer> list, int k) {
	    int low = 0, high = list.size()-1;
	    while(low<=high){
            int mid = low + (high - low )/2;
            if(list.get(mid) == k){
                return mid;
            }
            else if(list.get(mid) < k){
                low = mid +1 ;
            }

            else if(list.get(mid) > k){
                high = mid - 1;
            }
        }
        return -1;
	}
}