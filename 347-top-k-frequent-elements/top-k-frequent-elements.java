import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Keep only k elements
        for (int num : map.keySet()) {

            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Put heap elements into answer
        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            answer[i] = pq.poll();
        }

        return answer;
    }
}