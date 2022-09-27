class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //1. First, we create an result list that contains a single empty list.
        List<List<Integer>> result = new ArrayList();
        result.add(new ArrayList<Integer>());
        
        //2. Then, we loop through all the numbers in the input array.
        for (int num : nums) {
            //3. For each number, we create a new list that contains the number.
            List<List<Integer>> newSubsets = new ArrayList();
            //4. We then add this newly created list to the result list.
              for (List<Integer> curr : result) {
                  newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
              }
            //5. Finally, we loop through all the newly created lists 
              for (List<Integer> curr : newSubsets) {
                  result.add(curr);//and add them to the result list as well.
              }
        }
        return result;
    }
}
