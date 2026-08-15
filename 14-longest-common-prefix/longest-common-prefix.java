class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
       
        for (int i = 1; i < strs.length; i++) {

            StringBuilder text = new StringBuilder();

            for (int j = 0; j < Math.min(prefix.length(), strs[i].length()); j++) {

                if (prefix.charAt(j) == strs[i].charAt(j)) {
                    text.append(prefix.charAt(j));
                } else {
                    break;
                }
            }

            prefix = text.toString();

            if (prefix.length() == 0) {
                return "";
            }
        }

        return prefix;
    }
}