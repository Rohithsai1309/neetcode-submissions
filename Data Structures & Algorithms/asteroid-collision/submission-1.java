class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();

        for(int i:asteroids){
            collision(i,s);
        }
        int[] ans=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--){
            ans[i]=s.pop();
        }
    return ans;
    }

    public void collision(int in,Stack<Integer> s){
        if(s.isEmpty() || (s.peek()>0 && in>0) || (s.peek()<0 && in<0)){
            s.push(in);
        }
        else{
            boolean cond=true;
            while(!s.isEmpty() && cond){
                if((s.peek()>0 && in<0)){
                    int a=s.pop();
                    int b=in;
                    if(Math.abs(a)==Math.abs(b)){
                        return;
                    }
                    in=Math.abs(a)>Math.abs(b)?a:b;
                }
                else{
                    cond=false;
                }
            }
            s.push(in);
        }
    }
}