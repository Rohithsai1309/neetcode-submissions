class Solution {
    public int maxArea(int[] heights) {
        int left=0;int right=heights.length-1;int maxarea=0;
        while(left<=right){
            int area=(right-left)*(Math.min(heights[left],heights[right]));
            maxarea=area>maxarea?area:maxarea;
            if(heights[left]<=heights[right]){
                left++;
                continue;
            }
            if(heights[left]>heights[right]){
                right--;
                continue;
            }
        }
        return maxarea;
    }
}
