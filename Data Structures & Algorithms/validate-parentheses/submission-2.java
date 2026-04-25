class Solution {
    public boolean isValid(String st) {
        Stack<Character> s=new Stack<>();
        for(char c:st.toCharArray()){
            if(c=='{')s.push('}');
            else if(c=='(')s.push(')');
            else if(c=='[')s.push(']');
            else{
                if(s.isEmpty())return false;
                if(s.peek()!=c){
                    break;
                }
                s.pop();
            }
        }
    return s.isEmpty();
    }
}
