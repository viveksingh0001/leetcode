class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if((rows * cols) != (r * c)) return mat;
        
        int[][] reshape = new int[r][c];
        int r1 = 0;
        int c1 = 0;
        for(int[] i : mat){
            for(int j: i){
                if(r1<r){
                    if(c1<c){
                        reshape[r1][c1] = j;
                        c1++;
                    } else{
                        r1++;
                        c1 = 0;
                        reshape[r1][c1] = j;
                        c1++;
                    }
                }
            }
        }
        return reshape;
    }
}