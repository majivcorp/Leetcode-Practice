class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
      
        // Initialize the result list to hold groups of anagrams.
        List<List<String>> res = new ArrayList<>();
        
        // If the input array is empty, return the empty result list.
        if (strs.length == 0) {
            return res;
        }

        // Initialize a map to keep track of groups of anagrams.
        HashMap<String, List<String>> map = new HashMap<>();
        
        // Iterate through each string in the input array.
        for (String s : strs) {
            // Initialize an array to count the occurrences of each letter in the current string.
            int[] hash = new int[26];
            
            // Iterate through each character in the current string.
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            
            // Convert the counts array to a string to be used as a key in the map.
            String key = new String(Arrays.toString(hash));
            
            // If the key does not exist in the map, add it with an empty list as the value.
            map.computeIfAbsent(key, k -> new ArrayList<>());
            
            // Add the current string to the list of anagrams in the map corresponding to this key.
            map.get(key).add(s);
        }
        
        // This adds all the lists of anagrams from the map to the result list.
        res.addAll(map.values());
        
        // Return the result list containing all the groups of anagrams.
        return res;
    }
}
