**Doesn't work**
class Solution {
public int maxAreaOfIsland(int[][] grid) {
int[][] dp = new int[grid.length][grid[0].length];
int maxVal = 0;
for(int i=0; i<grid.length; i++){
for(int j=0; j<grid[0].length; j++){
if(grid[i][j]==1){
if(i==0)
dp[i][j] = dp[i][j-1] + 1;
else if(j==0)
dp[i][j] = dp[i-1][j] + 1;
else
dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + 1;
}
if(dp[i][j]>maxVal)
maxVal = dp[i][j];
}
}
return maxVal;
}
}