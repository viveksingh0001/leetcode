**Time limit exceeds**
​
class Solution {
public int numMatchingSubseq(String s, String[] words) {
Map<Character, Queue> map = new HashMap<>();
for(int i=0; i<s.length(); i++){
char c = s.charAt(i);
if(map.containsKey(c)){
Queue<Integer> q = map.get(c);
q.add(i);
map.put(c, q);
} else{
Queue<Integer> q = new LinkedList<Integer>();
q.add(i);
map.put(c, q);
}
}
int count = 0;
for(String s1: words){
Map<Character, Queue> map1 = new HashMap<>();
for (Map.Entry<Character, Queue> entry : map.entrySet()) {
map1.put(entry.getKey(),
new LinkedList<>(entry.getValue()));
}
if(isSubsequence(map1, s1))
count++;
}
return count;
}
private boolean isSubsequence(Map<Character, Queue> map, String s1){
boolean flag = true;
int lastIndex = -1;
for(int i=0; i<s1.length(); i++){