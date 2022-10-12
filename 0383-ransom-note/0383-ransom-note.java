class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r = ransomNote.length();
        int m = magazine.length();
        if(r>m)
            return false;
        int[] arr = new int[26];
        for(int i=0; i<r; i++){
            char c = ransomNote.charAt(i);
            arr[c-'a'] +=1;
        }
        
        for(int i=0; i<m; i++){
            char c = magazine.charAt(i);
            arr[c-'a'] -=1;
        }
        
        for(int i=0; i<26; i++){
            if(arr[i]>0)
                return false;
        }
        return true;
    }
}