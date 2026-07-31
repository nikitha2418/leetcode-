class Solution {
    public String electionWinner(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Count votes
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        int maxVotes = 0;
        String winner = "";
        
        // Find winner with tie-breaking
        for (String key : map.keySet()) {
            int votes = map.get(key);
            
            if (votes > maxVotes) {
                maxVotes = votes;
                winner = key;
            } else if (votes == maxVotes) {
                if (winner.compareTo(key) > 0) {
                    winner = key; // lexicographically smaller
                }
            }
        }
        
        return winner;
    }
}