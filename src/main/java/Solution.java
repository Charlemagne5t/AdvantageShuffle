import java.util.*;

public class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, List<Integer>> map2 = new HashMap<>();

        for(int i = 0 ; i < n; i ++){
            List<Integer> indexes = map2.getOrDefault(nums2[i], new ArrayList<>());
            indexes.add(i);
            map2.put(nums2[i], indexes);
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] array = new int[n];
        Arrays.fill(array, - 1);

        // i - 1st index j - 2nd index
        int j = n - 1;
        int inserts = 0;
        for(int i = n - 1; i >= 0; i--){
            while(j > 0 && nums2[j] >= nums1[i]){
                j--;
            }
            if(j >= 0 && nums1[i] > nums2[j]){
                List<Integer> indexes = map2.get(nums2[j]);
                int origIndexOfJ = indexes.remove(indexes.size() - 1);
                if(indexes.isEmpty()){
                    map2.remove(nums2[j]);
                }
                array[origIndexOfJ] = nums1[i];
                inserts++;
                j--;
            }
        }
        if(inserts == n){
            return array;
        }

        int k = 0;
        for(int i = 0; i < n; i++){
            if(array[i] == -1){
                array[i] = nums1[k++];
            }
        }


        return array;
    }
}
