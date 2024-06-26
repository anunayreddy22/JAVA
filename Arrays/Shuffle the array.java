// 1047 Leetcode
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i=0;
        while(i<n){
            arr[i*2] = nums[i];
            arr[(i*2)+1] = nums[i+n];
            i++;
        }
        return arr;
    }
}
