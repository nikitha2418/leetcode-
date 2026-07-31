class Solution {
    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        // Your code here
        
      
        Set<Integer> s=new HashSet<>();
        for(int num:arr){
            s.add(num);
        }
        ArrayList<Integer> result=new ArrayList<>(s);
        Collections.sort(result);
        return result;
    }
}