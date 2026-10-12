class Solution {
    public boolean detectCapitalUse(String s) {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isLowerCase(ch[0])){
                return false;
            }
        }
        return true;
    }
}