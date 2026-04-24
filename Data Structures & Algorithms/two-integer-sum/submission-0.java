class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] diff=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            diff[i]=target-nums[i];
        }
        int start=0;
        int end=0;
        while(start<=nums.length-1){
            if(end>nums.length-1){
                start++;
                end=0;
            }
            if(start==end){
                end++;
            }
            if(diff[start]==nums[end]){
                return new int[]{start,end};
            }
            else{
                end++;
            }
            
        }
    return new int[]{0,1};
    }
}
