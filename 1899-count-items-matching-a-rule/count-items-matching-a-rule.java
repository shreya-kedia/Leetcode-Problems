class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String rule[]={"type","color","name"};
        int count=0;
        int index=Arrays.asList(rule).indexOf(ruleKey);
        for( List item: items){
            if(item.get(index).equals(ruleValue)) count++;
        }

        return count;

        
    }
}