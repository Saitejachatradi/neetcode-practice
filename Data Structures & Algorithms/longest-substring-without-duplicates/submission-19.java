class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int j = 0;
        int maxlength = 0;
        for(int i = 0; i < s.length();i++){
            char c= s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(j));
                j++;
            } set.add(c);
                maxlength = Math.max(maxlength , i - j + 1);
            }
            return maxlength;
        }
    }

