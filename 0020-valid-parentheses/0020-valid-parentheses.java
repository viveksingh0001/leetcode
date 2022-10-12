class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            } else{
                if(stack.isEmpty())
                    return false;
                char c1 = stack.pop();
                if(c!=map.get(c1))
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else return false;
    }
}