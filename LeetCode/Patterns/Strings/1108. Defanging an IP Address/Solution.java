class Solution {
    public String defangIPaddr(String s) {
        char ch[]=s.toCharArray();
        String ans="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='.'){
                ans=ans+"[.]";
            }
            else{
                ans+=ch[i];
            }
        }
        return ans;
    }
}