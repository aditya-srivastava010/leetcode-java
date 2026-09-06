class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int pref = 0;
        int count = 0;
        for (int i : nums) {
            pref += i;
            if (map.containsKey(pref - k)) {
                count += map.get(pref - k);
            }
            map.put(pref, map.getOrDefault(pref, 0) + 1);
        }
        return count;
    }
}