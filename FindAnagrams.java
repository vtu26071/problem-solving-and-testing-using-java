class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>(); if (s.length() < p.length()) return result; int[] pCount = new int[26]; int[] sCount = new int[26]; // Count frequency of characters in p
         for (char c : p.toCharArray()) { 
            pCount[c - 'a']++; 
            } // Sliding window over s 
            for (int i = 0; i < s.length(); i++) { 
                sCount[s.charAt(i) - 'a']++; 
                // Remove character when window size exceeds p.length() 
                if (i >= p.length()) {
                     sCount[s.charAt(i - p.length()) - 'a']--; 
                     
            } // Compare frequency arrays 
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
                 } 
                 } 
                 return result; 
                 } 
                 public static void main(String[] args) {
                     Solution sol = new Solution();
                     System.out.println(sol.findAnagrams("cbaebabacd", "abc")); 
        
    }
}
