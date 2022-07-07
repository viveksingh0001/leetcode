class Solution {
    private final Map<String, Boolean> map = new HashMap<>();
    private boolean dp(String s1, String s2, String s3, int i, int j){
        String key = i + "_" + j;
        int n1 = s1.length();
        int n2 = s2.length();
        if (i == n1) {
            return s2.substring(j).equals(s3.substring(i+j));
        }
        if (j == n2) {
            return s1.substring(i).equals(s3.substring(i+j));
        }
        if(n1==0 && n2==0 && s3.length()>0)
            return false;
        if(i+j>=s3.length())
            return false;
        if(i==n1 && j==n2)
            return true;
        if(map.containsKey(key))
            return map.get(key);
        if(i<n1 && s1.charAt(i)==s3.charAt(i+j) && dp(s1, s2, s3, i+1, j))
            return true;
        if(j<n2 && s2.charAt(j)==s3.charAt(i+j) && dp(s1, s2, s3, i, j+1))
            return true;
        map.put(key, false);
        return false;
    }
    
    public boolean isInterleave(String s1, String s2, String s3) {
         return dp(s1, s2, s3, 0, 0);
    }
}



