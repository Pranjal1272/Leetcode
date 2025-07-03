class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 0;
        int right = n - 1;
        
        
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                arr[left++] = nums[i];
            }
        }

        
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) {
                arr[left++] = nums[i];
            }
        }

        
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) {
                arr[left++] = nums[i];
            }
        }

        return arr;
    }
}
