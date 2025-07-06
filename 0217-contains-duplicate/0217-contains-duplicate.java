import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

for (int num : nums) {
    countMap.put(num, countMap.getOrDefault(num, 0) + 1);
}

// To find duplicates:
for (int count : countMap.values()) {
    if (count > 1) return true;
}
return false;

    }
}