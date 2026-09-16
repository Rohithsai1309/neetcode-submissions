class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            if(s.isEmpty()){
                s.push(i);
            }
            else{
                if(temperatures[i]>temperatures[s.peek()]){
                    while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i]){
                        int write=s.pop();
                        ans[write]=i-write;
                    }
                    s.push(i);
                }
                else{
                    s.push(i);
                }
            }
        }
    return ans;
    }
}
