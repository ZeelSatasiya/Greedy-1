class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;
        if(n <= 1) return 0;
        
        int jumps = 1;
        int currInterval = nums[0];
        int nextInterval = nums[0];
        
        for(int i = 1; i < n; i++){
            nextInterval = Math.max(nextInterval, nums[i] + i);
            
            if(i < n - 1 && i == currInterval){
                jumps++;
                currInterval = nextInterval;
            }
        }
        return jumps;
    }
}
