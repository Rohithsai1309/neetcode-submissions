class Solution {
    public int searchInsert(int[] nums, int t) {
           int start=0,end=nums.length-1;
           while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==t)return mid;
            else if(nums[mid]<t){
                start=mid+1;
            }
            else end=mid-1;
           }
    return start;
    }
}