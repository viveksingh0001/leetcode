class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        int n = s1.length();
        for(int i=0; i<n/2; i++){
            System.out.println("a = " + s1.charAt(i) + ", b = " + s1.charAt(n-1-i));
            if(Character.toLowerCase(s1.charAt(i))!=Character.toLowerCase(s1.charAt(n-1-i))){
                return false;
            }
        }
        return true;
    }
}