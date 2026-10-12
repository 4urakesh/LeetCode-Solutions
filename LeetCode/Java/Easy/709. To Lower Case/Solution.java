class Solution {
    public String toLowerCase(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
          if(Character.isUpperCase(s.charAt(i))){
              ans=ans+(char)(s.charAt(i)+32);
          }
          else{
            ans+=s.charAt(i);
          }
        }
    return ans;
    }
}