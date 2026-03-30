class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
            return false;
        }
        char[] arrOne = s.toCharArray();
        char[] arrTwo = t.toCharArray();
        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);
        
        for (int i = 0; i < s.length(); i++) {
            if (arrOne[i] != arrTwo[i]) {
                return false;
            }
        }
        return true;
    }
}
