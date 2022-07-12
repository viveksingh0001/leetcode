class Solution {
    private boolean rec(int[] matchSticks, int[] sideArray, int side, int i){
        if(i>=matchSticks.length)
            return true;
        for(int j=0; j<4; j++){
            if(sideArray[j] + matchSticks[i] <= side){
                sideArray[j] += matchSticks[i];
                boolean flag = rec(matchSticks, sideArray, side, i+1);
                if(flag)
                    return true;
                sideArray[j] -= matchSticks[i];
            }
        }
        return false;
    }
    
    public boolean makesquare(int[] matchsticks) {
        int length = IntStream.of(matchsticks).sum();
        if(length%4!=0)
            return false;
        int side = length/4;
        int[] sideArray = new int[4];
        Arrays.fill(sideArray, 0);
        matchsticks = Arrays.stream(matchsticks).boxed()
    .sorted(Collections.reverseOrder())
    .mapToInt(Integer::intValue)
    .toArray();
        return rec(matchsticks, sideArray, side, 0);
       
    }
}