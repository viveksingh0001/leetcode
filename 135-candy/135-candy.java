class Solution {
    public int candy(int[] ratings) {
        int[] r1 = new int[ratings.length];
        int[] r2 = new int[ratings.length];
        Arrays.fill(r1, 1);
        Arrays.fill(r2, 1);
        int i=1;
        int j=ratings.length-2;        
        while(i<ratings.length || j>-1){
            if(i<ratings.length){
                if(ratings[i]>ratings[i-1]){
                    r1[i] = r1[i-1]+1;
                }
                i++;
            }
            if(j>-1){
                if(ratings[j]>ratings[j+1]){
                    r2[j] = r2[j+1] +1;
                } 
                 j--;
            }
        }
        int res = 0;
        for(i=0; i<ratings.length; i++){
            res+=Math.max(r1[i], r2[i]);
        }
        return res;
    }
}