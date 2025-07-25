class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left =0;
        int right = n-1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                arr[left] = nums[i];
                left++;
            }else{
                arr[right] = nums[i];
                right--;
            }
        }
        return arr;
        
    }
}