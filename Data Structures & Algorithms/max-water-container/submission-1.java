class Solution {
    public int maxArea(int[] heights) {
        int st=0;
        int end=heights.length-1;
        int max=0;
        while(st<end){
            int curr=Math.min(heights[end],heights[st])*(end-st);
            max=Math.max(max,curr);
            if(heights[end]>heights[st]){
                st++;
            }
            else end--;
        }
    return max;
    }
}
