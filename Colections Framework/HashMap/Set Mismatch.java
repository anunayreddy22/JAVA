// Leetcode 645

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            mp.put(i, 0);
        }

        for (int a : nums) {
            mp.put(a, mp.get(a) - 1);
        }

        int duplicate = 0, missing = 0;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == -1) {
                duplicate = entry.getKey();
            }
            if (entry.getValue() == 1) {
                missing = entry.getKey();
            }
        }

        return new int[]{duplicate, missing};
    }
}
