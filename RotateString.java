class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false; 
        return (s + s).contains(goal); 
        } 
        public static void main(String[] args) {
             Solution sol = new Solution();
              System.out.println(sol.rotateString("abcde", "cdeab")); 
        
    }
}
