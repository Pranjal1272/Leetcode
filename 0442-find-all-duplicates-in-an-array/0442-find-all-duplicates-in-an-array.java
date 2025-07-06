class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList();
        for(int num: nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            if(entry.getValue() == 2){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}