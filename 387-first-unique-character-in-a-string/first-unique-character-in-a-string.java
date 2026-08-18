class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0; i< s.length(); i++){
            
            if(map.containsKey(s.charAt(i))){
                // means already exist kerta h aur isko remove karenge toh agr koi s h jishmai 3 same repeating element h toh woh 3rd wala fir new ban jayega isliye isko flag ker do.... BAAD MAI SKIP KAR DENGE reomve se next repeated ke liye null value reh jayega
                map.put(s.charAt(i), -10);

            }
            else{
                map.put(s.charAt(i), i);
            }
        }
        int idx = Integer.MAX_VALUE;

        for( int i =0; i<s.length();i++){
            // now remove the flag one
            if(map.get(s.charAt(i)) == -10){
                continue; // very important write this else in 25 th line u will get NullPointerException as after removing that element u still wants its index
            }

            idx = Math.min(idx, map.get(s.charAt(i)));
        }


        if(idx >= 0 && idx< s.length()){
            return idx;
        }   
        return -1;
        
    }
}