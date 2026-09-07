class Solution {
    public String frequencySort(String s) {

        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int max = 0;

        //for(int i = 0; i < map.size(); i++){  WILL GIVE ERROR
        for(int i = 0; i<s.length(); i++){

            max = 0;
            char maxChar = ' ';

            // Find maximum frequency
            for(char key : map.keySet()){
                if(map.get(key) > max){
                    max = map.get(key);
                    maxChar = key;
                }
            }

            // Add character max times
            for(int j = 0; j < max; j++){
                sb.append(maxChar);
            }

            // Remove after iteration
            map.remove(maxChar);
        }

        return sb.toString(); 
    }
}