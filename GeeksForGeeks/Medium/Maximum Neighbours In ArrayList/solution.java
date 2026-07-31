class Solution {
    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr){
      ArrayList<Integer> ans = new ArrayList<Integer>();
      
      for(int i=1; i<arr.size(); i++){
        Integer maxv = arr.get(i);
        if(maxv < arr.get(i-1)){
          maxv = arr.get(i-1);    
        }
        
        ans.add(maxv);
      }
      
      return ans;
    }
}