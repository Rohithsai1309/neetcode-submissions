class Solution {
    public void sortColors(int[] nums) {
        int swap=0;
        int curr=0;
        int number=0;
        while( swap < nums.length && number<=2){
            if(curr>=nums.length){
                curr=swap;
                number++;
                continue;
            }
            
            if(nums[curr] == number ){
                swap(nums,swap++,curr);
            }
            
            curr++;
        }
    }
    public void swap(int[] x,int a,int b){
        int temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }
}