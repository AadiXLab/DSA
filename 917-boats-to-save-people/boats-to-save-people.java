class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int count = 0;
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            // repetion ka darr ai kyuki Q bolta hai ki kisi bhi person ka weight limit se zayda ni hoga

            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            count++;
        }

        return count;
    }
}