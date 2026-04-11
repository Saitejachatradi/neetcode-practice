class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int currNum = num;
                int currLength = 1;
            }
            while(set.contains(num+1)){
                currNum++;
                currLength++;
            }
          maxlength = Math.max(maxlength,currLength);
        }
    }
}
