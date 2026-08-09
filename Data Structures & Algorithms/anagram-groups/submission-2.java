class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                Map<String,List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            chr.toString();
            if(!map.containsKey(Arrays.toString(chr))) {
                map.put(Arrays.toString(chr), new ArrayList<>());
            }
            map.get(Arrays.toString(chr)).add(str);
        }
    return new ArrayList<>(map.values());
    }
}
