class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int track[]= new int[26];
        for(int i=0;i<s.length();i++){
            track[s.charAt(i)-'a']++;
            track[t.charAt(i)-'a']--;
        }
        for(int i: track){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
