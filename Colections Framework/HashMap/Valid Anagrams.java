// LeetCode 242
class Solution {
        public boolean isAnagram(String s, String t) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            for (char c : s.toCharArray()) {
                int val = map1.getOrDefault(c, 0);
                map1.put(c, val + 1);
            }
            for (char c : t.toCharArray()) {
                int val = map1.getOrDefault(c, 0);
                map1.put(c, val - 1);
            }
            for (int i : map1.values()) {
                if (i != 0)
                    return false;
            }
            return true;
        }
 }
