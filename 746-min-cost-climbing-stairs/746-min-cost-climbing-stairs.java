class Solution {
    Map<Integer, Integer> mem = new HashMap<>();
    private int dp(int i, int[] cost){
         if(i==0 || i==1){
             return 0;
         }
        if(mem.containsKey(i))
            return mem.get(i);
        int val = Math.min(cost[i-1] + dp(i-1, cost), cost[i-2] + dp(i-2, cost));
        mem.put(i, val);
        return val;
        
    }
    public int minCostClimbingStairs(int[] cost) {
        return dp(cost.length, cost);
    }
}