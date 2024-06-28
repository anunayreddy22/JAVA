// Leetcode 884
 class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

    HashMap<String,Integer>mp=new HashMap<>();
    HashMap<String,Integer>mp2=new HashMap<>();

    String[]ans= new String[s1.length()];

    String[]arr1=s1.split(" ");
    String[]arr2=s2.split(" ");

    for(int i=0;i<arr1.length;i++){
        mp.put(arr1[i], mp.getOrDefault(arr1[i], 0) + 1);
    }

    for(int i=0;i<arr2.length;i++){
        mp2.put(arr2[i], mp2.getOrDefault(arr2[i], 0) + 1);
    }

    int index=0;

    for(String m:mp.keySet()){
        
    if(mp.get(m)==1&&!mp2.containsKey(m)){
        ans[index++]=m;
    }

    }

    for(String m:mp2.keySet()){
        
    if(mp2.get(m)==1&&!mp.containsKey(m)){
        ans[index++]=m;
    }

    }

    ans=Arrays.copyOf(ans,index);

    return ans;


    }
}
