import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList();
        for(int num: nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        for(Integer key : freqMap.keySet()){
            if(freqMap.get(key)==2){
                result.add(key);
            }
        }
        return result;
    }
}