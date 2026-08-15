class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> result = new ArrayList<>();

        int[] prevInterval = intervals[0];
        result.add(prevInterval);

        for (int i = 1; i < intervals.length; i++) {

            int[] interval = intervals[i];

        //for (int[] interval : intervals) {
            if (interval[0] <= prevInterval[1]) {
                //merge
                prevInterval[1] = Math.max(prevInterval[1], interval[1]);
                prevInterval[0] = Math.min(prevInterval[0], interval[0]);

            } else {
                //don't merge
                prevInterval = interval;
                result.add(prevInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}