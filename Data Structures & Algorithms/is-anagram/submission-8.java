class Solution {
    public boolean isAnagram(String s, String t) {
       Set<Character> set = new HashSet<>();
       int[] a = new int[26];
       if(s.length() != t.length()){
        return false;
       }
for(int i = 0 ; i < s.length() - 1 ; i++){
        a[s.charAt(i) - 'a']++;
        a[t.charAt(i) - 'a']--;
       }
       for(int count: a){
        if(count != 0){
            return true;
        }
       }
       return false;
    }
}
