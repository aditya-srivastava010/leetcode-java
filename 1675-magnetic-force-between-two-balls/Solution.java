class Solution {
    public boolean isallocpossible(int mindist,int pos[],int m){
        int placed=1;
        int lastplaced=pos[0];
        for(int i=0;i<pos.length;i++){
            if(pos[i]-lastplaced>=mindist){
                placed++;
                lastplaced=pos[i];
            }
            if(placed>=m){
                return true;
            }
           
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int ans = 0;
        int st = 1;
        int end = position[position.length - 1] - position[0];
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isallocpossible(mid,position,m)) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}