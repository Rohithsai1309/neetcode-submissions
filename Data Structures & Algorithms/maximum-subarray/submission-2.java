class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int currmax=nums[0];
        for(int i:Arrays.copyOfRange(nums,1,nums.length)){
            currmax=Math.max(i,currmax+i);
            max=Math.max(currmax,max);
        }
    return max;
    }
}
