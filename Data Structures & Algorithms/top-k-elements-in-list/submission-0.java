class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Integer> map = new HashMap<>();

        for ( int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer>[] arr = new List[nums.length+1];
        for(Map.Entry<Integer, Integer> num : map.entrySet()) {
            if(arr[num.getValue()] == null) {
                arr[num.getValue()] = new ArrayList<>();
            }
                arr[num.getValue()].add(num.getKey());
        }

        int dtx = 0;
        int[] result = new int[k];
        for(int i = nums.length; i >= 0 &&  dtx < k; i--) {
            if(arr[i] != null) {
                for(int n : arr[i]) {
                    result[dtx++] = n;                   
                }
            }
        }
        return result;

    }
}
