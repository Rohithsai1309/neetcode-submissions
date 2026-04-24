class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int first=0,second=0;

        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(set.contains(diff)){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==diff){
                        return new int[]{i,j};
                    }
                }
            }
            continue;
        }
    return new int[2];
    }
}
