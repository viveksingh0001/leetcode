class Solution {
     
    int M = 1000000007;
    public int dfs(int m, int n, int maxMove, int startRow, int startColumn, int[][][] mem){
        if(startRow<0 || startColumn<0 || startRow>=m || startColumn>=n)
            return 1;
        
        if(maxMove==0)
            return 0;
        
        if(mem[startRow][startColumn][maxMove]>=0)
            return mem[startRow][startColumn][maxMove];
        
        int curVal = ((dfs(m, n, maxMove-1, startRow-1, startColumn, mem) 
            +  dfs(m, n, maxMove-1, startRow, startColumn-1, mem))%M 
            +  (dfs(m, n, maxMove-1, startRow+1, startColumn, mem) 
            +  dfs(m, n, maxMove-1, startRow, startColumn+1, mem))%M)%M;
        
        mem[startRow][startColumn][maxMove] = curVal;
        
        return curVal;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        System.out.println(M);
        int[][][] mem = new int[m][n][maxMove+1];
        for (int[][] l : mem) for (int[] sl : l) Arrays.fill(sl, -1);
        return dfs(m, n, maxMove, startRow, startColumn, mem);
    }
}