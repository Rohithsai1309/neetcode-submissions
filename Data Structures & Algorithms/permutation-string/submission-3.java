class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int i=0;
        while(i<s2.length()){
            int start=i;
            char now=s2.charAt(i);
            if(map.containsKey(now)){
                Map<Character,Integer> temp=new HashMap<>(map);
                while(start <s2.length() && temp.containsKey(s2.charAt(start))){
                    char now1=s2.charAt(start++);
                    if(temp.get(now1)==1){
                        temp.remove(now1);
                    }
                    else{
                        temp.put(now1,temp.get(now1)-1);
                    }
                    if(temp.size()==0)return true;
                }
            }
            i++;
        }
    return false;
    }
}
