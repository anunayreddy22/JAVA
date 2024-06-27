//Leetcode 344
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j= s.length-1;
        while(i<j)
        {
            s = reverse(s, i, j);
            i++;
            j--;
        }
        
    }

    public char[] reverse(char[] s, int i, int j)
    {
        char temp;
        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return s;
    }
}
