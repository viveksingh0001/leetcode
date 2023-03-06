class Solution {
    public String reverseWords(String s) {
        int l = 0;
        int r = 0;
        s = s.trim();
        Stack<String> st = new Stack<String>();
        for(; r<s.length(); r++){
            if(s.charAt(r)== ' ' && !s.substring(l, r).trim().equals("")){
                st.push(s.substring(l, r).trim());
                l = r;
            }
        }
        if(r!=0){
            st.push(s.substring(l, r).trim());
        }

        StringBuilder b = new StringBuilder();
        while(!st.isEmpty()){
            b.append(st.pop().trim());
            if(!st.isEmpty())
                b.append(" ");
        }
        return b.toString();
    }
}