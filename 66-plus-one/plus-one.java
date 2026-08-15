class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and carry to the previous digit
            digits[i] = 0;
        }

        // If all digits were 9, create a new array
        // in JAVA all elements are automatcailly gets assigned as 0
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}