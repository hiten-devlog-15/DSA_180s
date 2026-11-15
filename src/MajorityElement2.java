import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static List<Integer> majorityElementTwoBrute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            System.out.println(count);
            if(count >
                    nums.length/3){
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static List<Integer> majorityElementTwoBetter(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static List<Integer> majorityElementTwoOptimal(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int candidate1 = Integer.MIN_VALUE;
        int count1 = 0;

        int candidate2 = Integer.MIN_VALUE;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if (candidate1 == nums[i]) {
                count1++;
            }
            else if (candidate2 == nums[i]) {
                count2++;
            }
            else if (count1 == 0) { // nums[i] != candidate2 and nums[i] != candidate1 this condition is redundant bcoz
                // its been already checked in above 2 conditions
                count1 = 1;
                candidate1 = nums[i];
            }
            else if (count2 == 0) {
                count2 = 1;
                candidate2 = nums[i];
            }
            else if (candidate1 != nums[i] && candidate2 != nums[i]) {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int element : nums){
            if(element == candidate1){
                count1++;
            }
            if(element == candidate2){
                count2++;
            }
        }
        if(count1 > nums.length/3){
            list.add(candidate1);
        }
        if(count2 > nums.length/3){
            list.add(candidate2);
        }

        return list;
    }


        public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2, 2};
        int[] arr = {1, 2, 3, 1, 2, 1, 1, 4, 2, 2, 5, 2};
//        System.out.println(majorityElementTwoBetter(nums));
        System.out.println(majorityElementTwoOptimal(nums));
    }
}
