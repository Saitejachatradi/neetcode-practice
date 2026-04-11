class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxlength = 0;
        for(int num: nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num - 1)){
                int currNum = num;
                int currlength = 1;
            while(set.contains(currNum+1)){
                currNum++;
                currlength++;
            }
            maxlength = Math.max(maxlength,currlength);
        }
    
    }
     return maxlength;
}
}
