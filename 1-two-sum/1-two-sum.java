class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffPairMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(diffPairMap.containsKey(diff)){
                return new int[]{i, diffPairMap.get(diff)};
            }
            else{
                diffPairMap.put(nums[i], i);
            }
        }
        return null;
    }
}