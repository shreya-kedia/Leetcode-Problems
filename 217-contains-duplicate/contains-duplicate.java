class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); 
  
        // Iterate through the array 
        for (int t : nums) { 
            if(set.contains(t)) return true;
            // Add each element into the set 
            set.add(t); 
        }
        return false;
        //return (set.size()!= nums.length);

        
    }
}