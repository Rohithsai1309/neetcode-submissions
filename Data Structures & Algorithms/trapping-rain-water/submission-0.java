class Solution {
    public int trap(int[] height) {
        int start=1;int end=height.length-1;
        for(int i=0;i<height.length-1;i++){
            if(height[i+1]<height[i]){
                start=i+1;
                break;
            }
        }
        for(int i=height.length-1;i>1;i--){
            if(height[i-1]<height[i]){
                end=i-1;
                break;
            }
        }
        int water=0;
        for(int i=start;i<=end;i++){
            int curr=i;
            int leftmax=max(0,curr,0,height);
            int rightmax=max(curr,height.length-1,0,height);
            water+= Math.min(leftmax,rightmax)-height[curr];
            System.out.println(curr+" "+leftmax+" "+rightmax+" "+water);
        }
        return water;
    }
    public int max(int s,int e,int max,int[] height){
        for(int i=s;i<=e;i++){
            if(max<height[i]){
                max=height[i];
            }
        }
        return max;
    }
}
