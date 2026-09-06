class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
                
            }
            else{
                map.put(i, 1);
            }
        }
        int max=-1;
        int maxfre=Integer.MIN_VALUE;
       for(int key: map.keySet()){
        if(map.get(key)>maxfre){
            maxfre=map.get(key);
            max=key;
        }
      }   
    return max;
    }
}