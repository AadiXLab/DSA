class Solution {
    public boolean isSubsequence(String s, String t) {

      /*  if (s.equals("")) {
            return true;
        }

        if (t.equals("")) {
            return false;
        }

        int curr = 0;

        for (int i = 0; i < s.length(); i++) {

            int prev = curr;

            for (int j = curr; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j)) {
                    curr = j + 1;
                    break;
                }
            }
            if (prev == curr) {
                return false;
            }
        }

        return true;
    }*/
        int sp = 0;
        int tp = 0;

        while(sp < s.length() && tp < t.length()){
            if(s.charAt(sp) == t.charAt(tp)){
                sp++;
            }
            tp++;
        }
        if(sp == s.length()){
            return true;
        }
        else{
            return false;
        }
    }
}
