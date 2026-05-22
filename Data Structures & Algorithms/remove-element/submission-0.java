class Solution {
    public int removeElement(int[] nums, int val) {
        int curr=0;
        int swap=0;
        int count=0;
        while(curr!=nums.length){
            if(nums[curr]!=val)count++;
            if(nums[curr]==val){
                for(int i=nums.length-1;i>=0;i--){
                    if(nums[i]!=val){
                        swap=i;
                        break;
                    }
                }
                if(curr<swap){
                    count++;
                    int temp=nums[curr];
                    nums[curr]=nums[swap];
                    nums[swap]=temp;
                }
            }
            curr++;
        }
        for(int i:nums){
            System.out.print(i);
        }
    return count;
    }
}