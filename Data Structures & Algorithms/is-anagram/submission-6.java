class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        char[] arrOne = s.toCharArray();
        char[] arrTwo = t.toCharArray();

        for (int i = 0; i < arrOne.length; i++) {
            arr[arrOne[i] - 'a']--;
            arr[arrTwo[i] - 'a']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 ) return false;
        }
        return true;
    }
}
