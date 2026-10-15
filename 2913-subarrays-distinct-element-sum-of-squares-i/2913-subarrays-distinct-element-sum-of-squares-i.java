class Solution {
public int desti(List<Integer> arr, int i, int j) {
HashSet<Integer> ans = new HashSet<>();
    for (int k = i; k <= j; k++) {
        ans.add(arr.get(k));
    }
    int dis = ans.size() * ans.size();
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
