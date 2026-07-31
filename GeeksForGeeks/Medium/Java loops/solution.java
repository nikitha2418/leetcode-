class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
             ArrayList<Integer> a=new ArrayList<>();
          int evensum=0;
        int oddsum=0;
        for (int i=N;i>=0;i--){
            if(i%2==0){
                evensum+=i;
            }
            else{
                oddsum+=i;
            }
    }
      a.add(Integer.valueOf(evensum));
      a.add(Integer.valueOf(oddsum));
        
       return a;
    }
  }