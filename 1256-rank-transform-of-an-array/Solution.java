import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        // Step 1: Copy the original array
        int[] temp = arr.clone();

        // Step 2: Sort the copied array
        Arrays.sort(temp);

        // Step 3: Store unique value -> rank
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < temp.length; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank++;
            }
        }

        // Step 4: Replace original values with their ranks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}