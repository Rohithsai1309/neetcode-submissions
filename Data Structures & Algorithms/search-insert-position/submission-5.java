class Solution {
    public int searchInsert(int[] nums, int t) {
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==t)return mid;
            else if(nums[mid]<t){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    return st;
    }
}