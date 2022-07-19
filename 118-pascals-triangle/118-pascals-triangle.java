class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        
        for(int i=1; i<numRows; i++){
            List<Integer> l = new ArrayList<>();
            List<Integer> l2 = res.get(i-1);
            for(int j=0; j<=i; j++){
                if(j==0 || j==i)
                    l.add(1);
                else{
                    l.add(l2.get(j-1) + l2.get(j));
                }
            }
            res.add(l);
        }
        return res;
    }
}