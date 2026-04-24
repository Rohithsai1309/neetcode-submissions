class Solution {
    public int index(char[] arr,char c){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c)return i;
        }
        return -1;
    }
    public boolean isValid(String st) {
        Stack<Character> s=new Stack<>();
        char[] opening={'(','{','['};
        char[] closing={')','}',']'};
        for(char c:st.toCharArray()){
            if(s.isEmpty()){
                if(index(opening,c)!=-1){
                    s.push(c);
                }
                else{
                    return false;
                }
            }
            else if(index(opening,s.peek())==index(closing,c)){
                s.pop();
            }
            else if(index(opening,c)>-1){
                s.push(c);
            }
            else if(index(opening,s.peek())!=index(closing,c)){
                return false;
            }
        }
    return s.isEmpty();
    }
}
