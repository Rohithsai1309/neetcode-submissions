class Solution {
    public int majorityElement(int[] nums) {
        int first=nums[0];
        int counter=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==first){
                counter++;
            }
            else{
                counter--;
                if(counter==0){
                    first=nums[i];
                    counter=1;
                }
            }
        }
    return first;
    }
}