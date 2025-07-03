class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k > n

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the rest
        reverse(nums, k, n - 1);
    }

    // Two-pointer reverse helper
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            // Swap elements at left and right
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
