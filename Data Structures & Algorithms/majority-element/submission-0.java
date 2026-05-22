class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxFreq=0;
        int maxEle=0;
        for(Map.Entry<Integer,Integer> set:map.entrySet()){
            if(set.getValue()>maxFreq){
                maxFreq=set.getValue();
                maxEle=set.getKey();
            }
        }
    return maxEle;
    }
}