class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int repeat=nums.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>repeat)list.add(i);
        }
        return list;
    }
}