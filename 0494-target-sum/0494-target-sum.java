class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         int n=nums.length-1;
         return helper(nums,target,n,0);
        }
        public int helper(int[] nums,int target,int n,int sum){
            if(n<0 && sum==target) return 1;
            if(n<0) return 0;
            int c1 = helper(nums,target,n-1,sum+nums[n]);
            int c2= helper(nums,target,n-1,sum-nums[n]);
            return c1+c2;

        }
        
 }
