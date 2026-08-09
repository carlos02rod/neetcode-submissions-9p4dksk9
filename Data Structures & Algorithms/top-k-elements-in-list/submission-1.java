class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        if(map.containsKey(nums[i])) {
            map.put(nums[i],map.get(nums[i]) + 1);
        } else {
            map.put(nums[i], 1);
        }
    }


    List<Integer>[] arr = new List[nums.length + 1];
     for(Map.Entry<Integer, Integer> num : map.entrySet()) {
         //
         if(arr[num.getValue()] == null) {
             arr[num.getValue()] = new ArrayList<>();
         }
             arr[num.getValue()].add(num.getKey());

     }
    int j = 0;
     int[] arr1 = new int[k];
     for (int i = nums.length; i >= 0 && j < k; i--) {
         if (arr[i] != null) {
             for (int rt : arr[i]) {
                 arr1[j] = rt;
                 j++;
             }
         }
     }
     return arr1;

    }
}
