class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for(int candy : candies){
            maxCandies = Math.max(maxCandies, candy);

        }

        int threshold = maxCandies - extraCandies;

        for(int candy : candies){
            result.add(candy >= threshold);

        }

        return result;

        


        
    }
}