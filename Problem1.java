// Greedy
class Solution {
    
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int destination = n - 1;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] >= (destination - i)){
                destination = i;
            }
        }
        if(destination == 0) return true;
        return false;
    }
  
}
