class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxlength = 0;
        int i = 0;
        for(int j = 0; j < s.length(); j++){
         char c = s.charAt(j);
           while(set.contains(c)){
             set.remove(s.charAt(i));
             i++;
           }
           set.add(c);
           maxlength = Math.max(maxlength, j - i + 1);
        }
        return maxlength;
    }
}
