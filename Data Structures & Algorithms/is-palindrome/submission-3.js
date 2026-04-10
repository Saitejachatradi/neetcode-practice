class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
     let i = 0;
     let j = s.length - 1;
     while(i < j){
       while(i < j && !/[A-Za-z0-9]/.test(s.charAt(i))){
        i++;
       }
       while(i < j && !/[A-Za-z0-9]/.test(s.charAt(j))){
        j--;
       }
     if(s[i].toLowerCase() != s[j].toLowerCase()){
        return false;
     }
     i++; 
     j--;
     }
return true;
    }
}
