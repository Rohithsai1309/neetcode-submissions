class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        help(nums,0,nums.length-1);
        help(nums,0,k-1);
        help(nums,k,nums.length-1);
    }
    public void help(int[] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
}