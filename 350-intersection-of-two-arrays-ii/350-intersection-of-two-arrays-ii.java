class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            int val = nums1[i];
            if(countMap.containsKey(val)){
                countMap.put(val, countMap.get(val)+1);
            } else{
                countMap.put(val, 1);
            }
        }
        
        for(int i=0; i<nums2.length; i++){
            int val = nums2[i];
            if(countMap.containsKey(val)){
                l.add(val);
                
                if(countMap.get(val)==1)
                    countMap.remove(val);
                else
                    countMap.put(val, countMap.get(val)-1);
            }
        }
        return l.stream().mapToInt(i -> i).toArray();
    }
}