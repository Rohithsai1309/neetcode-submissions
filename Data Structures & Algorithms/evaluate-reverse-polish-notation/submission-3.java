class Solution {
    public int operation(String a1,String b1,String op){
        int a=Integer.valueOf(a1);
        int b=Integer.valueOf(b1);
        if(op.equals("+"))return a+b;
        if(op.equals("-"))return a-b;
        if(op.equals("*"))return a*b;
        if(op.equals("/"))return a/b;
    return 1;
    }
    public int evalRPN(String[] tokens) {
        Stack<String> s=new Stack<>();
        for(String i:tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/") ){
                String a1=s.pop();
                String a2=s.pop();
                s.push(String.valueOf(operation(a2,a1,i)));
            }
            else{
                s.push(i);
            }
        }
    return Integer.valueOf(s.pop());
    }
}