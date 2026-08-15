class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        for(int i = 0; i<intervals.length; i++){
            int[] interval = intervals[i];
            if(interval[0] <= newInterval[1] && interval[1] >= newInterval[0]){
                newInterval[1] = Math.max(newInterval[1], interval[1]);
                newInterval[0] = Math.min(newInterval[0], interval[0]);
            }
            else{ //add interval to result that is not overlapping while iterating in intervals
                result.add(interval);
            }
        }
        result.add(newInterval);
        Collections.sort(result, (a, b) -> a[0] - b[0]);

        return result.toArray(new int[result.size()][]);
    }
}