class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxlength = 0;
        for(int num: nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num - 1)){
              int currnum = num;
              int currlength = 1;
              while(set.contains(currnum + 1)){
                currnum++;
                currlength++;
              }
              maxlength = Math.max(currlength,maxlength);
            }
        }
        return maxlength;
        
    }
}
