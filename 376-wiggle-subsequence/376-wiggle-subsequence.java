class Solution {
    public int wiggleMaxLength(int[] nums) {
        int i = 1;
        int res = 1;
        while (i < nums.length && nums[i] == nums[i-1]) i++;
        if (i == nums.length) return 1;
        boolean up = nums[i-1] > nums[i];
        for (; i < nums.length; i++)
            if ((up && nums[i] < nums[i-1]) || (!up && nums[i] > nums[i-1])) {
                up = !up;
                res++;
            }
        return res;
    }
}