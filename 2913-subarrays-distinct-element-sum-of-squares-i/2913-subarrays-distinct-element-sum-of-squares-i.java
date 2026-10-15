class Solution {
public int desti(List<Integer> arr, int i, int j) {
HashMap<Integer, Integer> map = new HashMap<>();
    for (int k = i; k <= j; k++) {
        int num = arr.get(k);
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    int dis = map.size() * map.size();
    return dis;
}
public int sumCounts(List<Integer> nums) {
    int n = nums.size();
    int ans = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            ans += desti(nums, i, j);
        }
    }
    return ans;
}


}
