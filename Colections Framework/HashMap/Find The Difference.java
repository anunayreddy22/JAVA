// Leetcode 389
class Solution {
     public char findTheDifference(String s, String t) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count character frequencies in string s
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Update character frequencies for string t and find the extra character
        for (char c : t.toCharArray()) {
            if (!frequencyMap.containsKey(c) || frequencyMap.get(c) == 0) {
                return c;
            } else {
                frequencyMap.put(c, frequencyMap.get(c) - 1);
            }
        }
        
        // Dummy return, won't reach here for valid inputs
        return ' ';
    }
}
