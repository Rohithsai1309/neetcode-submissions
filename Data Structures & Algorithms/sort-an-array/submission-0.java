class Solution {
    public int[] sortArray(int[] nums) {
         helper(nums,0,nums.length-1);
         return nums;
    }

    public void helper(int[] x,int start,int end){
        if(start>=end)return;
        int pivot=x[start];
        int swap=start+1;
        for(int i=start+1;i<=end;i++){
            if(x[i]<=pivot)swap(x,i,swap++);
        }
        swap(x,swap-1,start);
        int pivotIndex = swap - 1;

        helper(x, start, pivotIndex - 1);
        helper(x, pivotIndex + 1, end);
    }
    public void swap(int[] x,int i1,int i2){
        int temp=x[i1];
        x[i1]=x[i2];
        x[i2]=temp;
    }

}