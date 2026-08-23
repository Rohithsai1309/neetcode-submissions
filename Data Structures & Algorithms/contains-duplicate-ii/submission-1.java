class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int upperlimit=nums.length<i+k+1?nums.length:i+k+1;
            for(int j=i+1;j<upperlimit;j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k)return true;
            }
        }
    return false;
    }
}