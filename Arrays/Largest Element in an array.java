// GeeksforGeeks Easy Basic Problem

class Solution {
    public static int largest(int n, int[] arr) {
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
