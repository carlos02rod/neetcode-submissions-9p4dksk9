class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> list = new ArrayList<>();
    boolean[] visited = new boolean[strs.length];

    for (int i = 0; i < strs.length; i++) {
        if(visited[i]) continue;


        visited[i] = true;
        List<String> group = new ArrayList<>();
        group.add(strs[i]);
        for ( int j = i+1; j < strs.length; j++) {
            if(visited[j]) continue;
            if(!visited[j] && isAnagram(strs[i], strs[j])) {
                group.add(strs[j]);
                visited[j] = true;
            }
        }
        list.add(group);
    }
    return list;
    }


  boolean isAnagram(String s, String i) {
        if(s.length() != i.length()) return false;
        int[] arr = new int[26];


        char[] arrOne = s.toCharArray();
        char[] arrTwo = i.toCharArray();

        for (int q = 0; q < arrOne.length; q++) {
            arr[arrOne[q] - 'a']--;
            arr[arrTwo[q] - 'a']++;
        }

        for(int r : arr) {
            if(r != 0) {
                return false;
            }
        }
        return true;
    }

}
