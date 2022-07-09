class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n];
        Arrays.fill(sum, Integer.MIN_VALUE);
        if(nums.length==0)
            return 0;
        int i = n-2;
        sum[n-1] = nums[n-1]; 
        
        Deque<Integer> deque
            = new LinkedList<Integer>();
        
        deque.addFirst(n-1);
        
        while(i>-1){
            if(deque.peekFirst()>i+k)
                deque.removeFirst();
        
            sum[i] = nums[i] + sum[deque.peekFirst()];
            
            while(!deque.isEmpty()&&sum[i]>sum[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);
            i--;
        }
        return sum[0];
    }
}