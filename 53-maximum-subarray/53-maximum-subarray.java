class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        if(nums.length==1)
            return sum;
        int maxSum = sum;
        for(int i=1; i<nums.length; i++){
            int curVal = nums[i];
            
            if(sum+curVal>curVal)
                sum+=curVal;
            else
                sum = curVal;
            if(sum>maxSum)
                maxSum = sum;
        }
        return maxSum;
    }
}