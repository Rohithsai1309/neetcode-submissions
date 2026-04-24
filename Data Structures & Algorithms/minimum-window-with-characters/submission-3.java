class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> target=new HashMap<>();
        for(char c:t.toCharArray()){
            target.put(c,target.getOrDefault(c,0)+1);
        }
        int start=0;
        int end=0;
        int min=1001;
        int curr=0;
        String ans="";
        Map<Character,Integer> temp=new HashMap(target);
        StringBuilder sb=new StringBuilder();
        while(start<s.length()){
            if(end == s.length()){
                start++;
                end=start;
                curr=0;
                sb=new StringBuilder();
                continue;
            }
            char c = s.charAt(end);
            if(temp.containsKey(c)){
                if(temp.get(c)>1)temp.put(c,temp.get(c)-1);
                else{
                    temp.remove(c);
                }
            }
            curr++;
            end++;
            sb.append(c);
            System.out.println("char "+c+" curr "+curr+" start "+start+" end "+end +" string "+sb.toString());
            if(curr<min && temp.isEmpty() && curr>=t.length()){
                ans=sb.toString();
                min=curr;
                start++;
                end=start;
                temp=new HashMap(target);;
                curr=0;
                sb=new StringBuilder();
            }
            else if(curr>=min){
                start++;
                end=start;
                curr=0;
                temp=new HashMap(target);;
                sb=new StringBuilder();
            } 
        }
    return ans;
    }
}