class Solution {
    public boolean isAnagram(String s, String t) {
     if (s.length() != t.length()) {
            return false;
        }
        char[] one = s.toCharArray();
        char[] two = t.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        for (int i = 0; i < one.length; i++) {
        if(one[i] != two[i]) {
            return false;
        }
        }
        return true;
    }
}
