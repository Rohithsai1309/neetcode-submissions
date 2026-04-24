class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[k];
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        while(k>0){
            int max=0;
            int freq=0;
        for(int i:map.keySet()){
            if(map.get(i)>freq){
                max=i;
                freq=map.get(i);
            }
        }
        map.remove(max);
        arr[k-1]=max;
        k--;
        }
    return arr;
    }
}
