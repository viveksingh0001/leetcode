class Solution {
    public String longestPalindrome(String s) {
        String maxSub = "";
        int maxLen = 0;
        for (int i=0; i<s.length(); i++){
            maxSub = getOddMaxSub(i, s, maxSub, maxLen);
            maxLen = maxSub.length();
            maxSub = getEvenMaxSub(i, s, maxSub, maxLen);
        }
        return maxSub;
    }
    
    private String getOddMaxSub(int i, String s, String maxSub, int maxLen){
        int left = i;
        int right = i;
        if(maxLen==0){
            maxLen = 1;
            maxSub = s.substring(i, i+1);
        }
        while(left>-1 && right <s.length()){
            if(s.charAt(left) == s.charAt(right)){
                int curLength = right-left+1;
                if(curLength>maxLen){
                    maxLen = curLength;
                    maxSub = s.substring(left, right+1);
                }
                left--;
                right++;
            } else{
                break;
            }
        }
        return maxSub;
    }
    
    private String getEvenMaxSub(int i, String s, String maxSub, int maxLen){
        int left = i;
        int right = i+1;
        if(maxLen==0){
            maxLen = 1;
            maxSub = s.substring(i, i+1);
        }
        while(left>-1 && right <s.length()){
            if(s.charAt(left) == s.charAt(right)){
                int curLength = right-left+1;
                if(curLength>maxLen){
                    maxLen = curLength;
                    maxSub = s.substring(left, right+1);
                }
                left--;
                right++;
            } else{
                break;
            }
        }
        return maxSub;
    }
}