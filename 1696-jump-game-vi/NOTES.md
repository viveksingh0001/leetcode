**Working slower solution**
​
class Solution {
public int maxResult(int[] nums, int k) {
int[] sum = new int[nums.length];
Arrays.fill(sum, Integer.MIN_VALUE);
if(nums.length==0)
return 0;
int i = nums.length-2;
sum[nums.length-1] = nums[nums.length-1];
while(i>-1){
int curMax = Integer.MIN_VALUE;
int jMax = Math.min(i+k, nums.length-1);
for(int j = i+1; j<=jMax; j++){
int curVal = nums[i] + sum[j];
curMax = Math.max(curMax, curVal);
}
sum[i] = curMax;
i--;
}
return sum[0];
}
}