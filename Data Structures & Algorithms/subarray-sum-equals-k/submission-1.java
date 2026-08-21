class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int prefix=0;
    map.put(0,1);
    int result=0;
    for(int i:nums){
        prefix+=i;
        int needed=prefix-k;
        result+=map.getOrDefault(needed,0);
        map.put(prefix,map.getOrDefault(prefix,0)+1);
    }
    return result;
    }
}