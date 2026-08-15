class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
               // sb.append(s.charAt(i));   IT DOES NOT CHANGE THE ORIGINAL ONE
            }
            else{
                 //ignore
                continue;
            }

        }
        int n = sb.length();
        int left = 0;
        int right = n-1;
        for(int i =0; left<right;i++){
        // for(int i =0; i< n/2; i++){    
            if(sb.charAt(left) == sb.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }

        }
        return true;
    }
}