class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> WindowMap = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<>();

        if(s.length() < p.length()){
            return result;
        }

        //storing p in map

        for(int i = 0; i<p.length(); i++){
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i),0) + 1);
        }
        int left =0;

        for(int right = 0; right< s.length(); right++){
            WindowMap.put(s.charAt(right),WindowMap.getOrDefault(s.charAt(right),0) +1 );
            //Window Size should be equal to p string
            if((right - left + 1) > p.length()){
                WindowMap.put(s.charAt(left), WindowMap.get(s.charAt(left)) -1);
                if(WindowMap.get(s.charAt(left)) == 0){
                    WindowMap.remove(s.charAt(left));
                }
                left++;
            }
            // comapre both Map
            if(pMap.equals(WindowMap)){
                result.add(left);
            }
        }
        return result;
        
    }
}