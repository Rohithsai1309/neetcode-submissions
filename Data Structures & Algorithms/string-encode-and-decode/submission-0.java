class Solution {

    public String encode(List<String> strs) {
        StringBuffer s=new StringBuffer();
        for(int i=0;i<strs.size();i++){
            int length=strs.get(i).length();
            if(length==0){
                s.append(0+"#");
                System.out.println(s);
            }
            else{
                s.append(length+"#"+strs.get(i));
            }
        }
        return s.toString();
    }
    public List<String> decode(String str) {
        ArrayList<String> arr=new ArrayList<>();
        int start=0;
        int end=1;
        while(end<str.length()){
            if(str.charAt(start)>='0' && str.charAt(start)<='9'){
                StringBuilder s=new StringBuilder();
                StringBuilder string=new StringBuilder();
                s.append(str.charAt(start));
                start++;
                while((str.charAt(start)!='#')){{
                    s.append(str.charAt(start));
                    start++;
                }}
                start++;
                end=start;
                int itr=Integer.valueOf(s.toString());
                if(itr==0){
                    arr.add("");
                    start=end;
                    continue;
                }
                while(itr>0){
                    string.append(str.charAt(end));
                    end++;
                    itr--;
                }
                
                arr.add(string.toString());
                
                start=end;
                continue;
                
                

            }
        }
        
        return arr;
    }
}
