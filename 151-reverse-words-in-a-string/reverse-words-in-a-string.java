class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        int pointer = n - 1;
        StringBuilder sb = new StringBuilder();

        while (pointer >= 0) {

             if (pointer < 0) {
                break;
            }

            // Skip extra spaces
            while (pointer >= 0 &&  s.charAt(pointer) == ' ') {
                pointer--;
            }

            // Mark the end of the word
            int end = pointer;

            // Move to the beginning of the word
            while (pointer >= 0 && s.charAt(pointer) != ' ') {
                pointer--;
            }

            // Append the word
            sb.append(s.substring(pointer + 1, end + 1));

            // Add space only if more words remain
            if (pointer >= 0) {
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}