class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            while(set.contains(c)){
               set.remove(s.charAt(j));
               j++;
            }
            set.add(c);
            maxlength = Math.max(maxlength , i - j + 1);
        }
        return maxlength;
    }
}
