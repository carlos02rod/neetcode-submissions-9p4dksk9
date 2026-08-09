class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[26];
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        
        for (char character : char1) {
            int i = character - 'a';
            arr1[i]++;
        }
        
        for (char character : char2) {
            int i = character - 'a';
            arr1[i]--;
        }
        

        for(int i : arr1) {
            if(i != 0) {
                return false; 
            }   
        }       
        return true;
    }
}
