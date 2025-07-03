class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 0;
        int right = 1;
        for(int i = 0;i<n;i++){
            if(nums[i]<0){
                arr[right] = nums[i];
                right = right+2;
            }else{
                arr[left] = nums[i];
                left = left+2;
            }
        }
        return arr;

    }
}