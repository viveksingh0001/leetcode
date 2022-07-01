class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max = 0;
        while(right < prices.length){
            int leftVal = prices[left];
            int rightVal = prices[right];
            if(rightVal<leftVal){
                left = right;
                right++;
            } else{
                if(rightVal-leftVal>max)
                    max = rightVal-leftVal;
                right++;
            }
        }
        return max;
    }
}