class Solution {
    public boolean isValid(String s) {
     Map<Character, Character> map = new HashMap<>();
     Stack<Character> stack = new Stack<>();
     map.put('(',')');
     map.put('[',']');
     map.put('{','}');
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
       if(map.containsKey(c)){
        stack.push(c);
       }
       else {
        if(stack.isEmpty() || map.get(stack.peek()) != c){
            return false;
        }
        stack.pop();
       }
    } return stack.isEmpty();
        
    }
}
