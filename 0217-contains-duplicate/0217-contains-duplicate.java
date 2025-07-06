import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();

        for(int num:nums){
            if(freq.containsKey(num)){
                return true;
            }
            freq.put(num,1);
        }
        return false;
        
    }
}