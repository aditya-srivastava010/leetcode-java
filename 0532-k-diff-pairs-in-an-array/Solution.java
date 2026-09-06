class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> pair_kitne_hai = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num - k)) {
                pair_kitne_hai.add(num - k);
            }
            if (set.contains(num + k)) {
                pair_kitne_hai.add(num);
            }
            set.add(num);
        }

        return pair_kitne_hai.size();
    }
}
// class Solution {
//     public int findPairs(int[] nums, int k) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int count=0;
//         for(int i:nums){
//              map.put(i, map.getOrDefault(i, 0) + 1);
//         }
//         for(int num:map.keySet()){
//             if(k==0){
//                 if(map.get(num)>1){
//                     count++;
//                 }
//             }
//             else{
//                 if (map.containsKey(num + k)) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }