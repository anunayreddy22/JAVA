// Leetcode 2073
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int val = tickets[k], res=0;
        for(int i=0; i<tickets.length; i++){
            if(i<=k){
                res = res+Math.min(tickets[i], val);
            } else{
                res = res+Math.min(tickets[i], val-1);
            }
        }
        return res;
    }	
}
