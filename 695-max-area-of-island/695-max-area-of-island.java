class Solution {
    Set<List<Integer>> set = new HashSet<>();
    private int dfs(int[][] grid, int rLen, int cLen, int r, int c){
        List<Integer> rc = Arrays.asList(r, c);
        if(r<0 || r==rLen || c<0 || c==cLen || grid[r][c]==0 || set.contains(rc))
            return 0;
        set.add(rc);
        return 1+dfs(grid, rLen, cLen, r+1, c) + dfs(grid, rLen, cLen, r, c+1) + dfs(grid, rLen, cLen, r-1, c) + dfs(grid, rLen, cLen, r, c-1) ;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rLen = grid.length;
        int cLen = grid[0].length;
        for(int i=0; i<rLen; i++){
            for(int j=0; j<cLen; j++){
                maxArea = Math.max(maxArea, dfs(grid, rLen, cLen, i, j));
            }
        }
        return maxArea;
    }
}