class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> ans=new Stack<>();
        for(String i:operations){
            if(i.equals("+")){
                int c2=ans.pop();
                int c1=ans.peek();
                int fresh=c1+c2;
                ans.push(c2);
                ans.push(fresh);
            }
            else if(i.equals("C")){
                ans.pop();
            }
            else if(i.equals("D")){
                ans.push(2*ans.peek());
            }
            else{
                ans.push(Integer.valueOf(i));
            }
        }
        int ansint=0;
        while(!ans.isEmpty()){
            ansint+=ans.pop();
        }
    return ansint;
    }
}