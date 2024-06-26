// Leetcode 905
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;                  // Initialize the first pointer at the beginning of the array.
        int j = nums.length - 1;    // Initialize the second pointer at the end of the array.

        while (i < j) {
            if (nums[i] % 2 == 0) {  // If nums[i] is even, increment i.
                i++;
            } else if (nums[j] % 2 != 0) {  // If nums[j] is odd, decrement j.
                j--;
            } else {  // If nums[i] is odd and nums[j] is even, swap them and update pointers.
                swap(nums, i, j);
                i++;
                j--;
            }
        }

        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
