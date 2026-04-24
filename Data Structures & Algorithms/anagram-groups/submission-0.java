class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int start=0;

        for(String i:strs){
            char[] all=i.toCharArray();
            Arrays.sort(all);
            String s=new String(all);
            if(!map.containsKey(s)){
                map.put(s,start);
                start++;
            }
            int index=map.get(s);
            if(ans.size()-1<index){
                ArrayList<String> temp=new ArrayList<>();
                temp.add(i);
                ans.add(temp);
            }
            else{
                ans.get(index).add(i);
            }
        }
        return ans;

    }
}
