// Leetcode 917
class Solution {
    public String reverseOnlyLetters(String se) {
        char str[]=se.toCharArray();
        int s=0,e=str.length-1;
        while(s<e){
            if(!((str[s]>='A' && str[s]<='Z') || (str[s]>='a' && str[s]<='z'))){
                s++;
                continue;
            }
            while(!((str[e]>='A' && str[e]<='Z') || (str[e]>='a' && str[e]<='z'))){
                e--;
            }
            char t=str[s];
            str[s]=str[e];
            str[e]=t;
            s++;
            e--;
        }
        String ans=new String(str);
        return ans;
    }
}
