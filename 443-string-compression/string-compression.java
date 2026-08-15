class Solution {
    public int compress(char[] chars) {

        int left = 0;
        int right = 0;
        int write = 0; // this is used as index which overwrites on chars

        while (right < chars.length) {

            int count = 0;

            // Count the current group
            while (right < chars.length && chars[left] == chars[right]) {
                right++;
                count++;
            }

            // Write the character
            chars[write] = chars[left];
            write++;

            // Write the count if greater than 1
            if (count > 1) {

                String str = String.valueOf(count);

                for (char c : str.toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }

            // Move to the next group
            left = right;
        }

        return write;
    }
}