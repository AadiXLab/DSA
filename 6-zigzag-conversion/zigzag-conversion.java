class Solution {

    StringBuilder ans = new StringBuilder();

    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        for (int i = 0; i < numRows; i++) {
            fxn(s, i, numRows);
        }

        return ans.toString();
    }

    private void fxn(String s, int row, int numRows) {

        int cycle = 2 * numRows - 2;

        for (int i = row; i < s.length(); i += cycle) {

            // Vertical character
            ans.append(s.charAt(i));

            // Diagonal character (only for middle rows)
            int diagonal = i + cycle - 2 * row;

            if (row != 0 &&
                row != numRows - 1 &&
                diagonal < s.length()) {

                ans.append(s.charAt(diagonal));
            }
        }
    }
}