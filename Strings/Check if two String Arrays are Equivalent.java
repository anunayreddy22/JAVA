// Check if two String Arrays are Equivalent  Leet Code 1662
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for(String s: word1){  
            str1+=s;
        }
        for(String s1: word2){
            str2+=s1;
            }
        if(str1.equals(str2)){
            return true;
            }
        return false;
    }
}
