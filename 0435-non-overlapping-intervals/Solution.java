class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;
        int k=0;
        int count=0;
        for(int i=1;i<n;i++){
            if(intervals[k][1]>intervals[i][0]){
                count++;
                if(intervals[i][1]<intervals[k][1]){
                    k=i;
                }
            }
            else{
                k=i;
            }
        }
        return count;
    }
}