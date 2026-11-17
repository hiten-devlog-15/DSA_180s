import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort012 {
    public static int[] sortZeroOneTwo(int[] nums) {

        //Brute
//        for(int i = 0; i < nums.length; i++){
//            for(int j  = i+1; j < nums.length; j++){
//                if(nums[j] < nums[i]){
//                    int temp = nums[i];
//                    nums[i] = nums[j];;
//                    nums[j] = temp;
//                }
//            }
//        }

        //Better
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            if(!map.containsKey(nums[i])){
//                map.put(nums[i], 1);
//            }else{
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
//
//        int idx = 0;
//        if(map.containsKey(0)){
//            for(int i = 0; i < map.get(0); i++){
//                nums[idx] = 0;
//                idx++;
//            }
//        }
//
//        if(map.containsKey(1)) {
//            for (int i = 0; i < map.get(1); i++) {
//                nums[idx] = 1;
//                idx++;
//            }
//        }
//
//        if(map.containsKey(2)) {
//            for (int i = 0; i < map.get(2); i++) {
//                nums[idx] = 2;
//                idx++;
//            }
//        }
//        return nums;

        //Optimal: 2 Pointers
        int low = nums[0];
        int mid = nums[0];
        int high = nums.length;




        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {1, 0, 2, 1, 0};
        int[] nums2 = {0, 0, 1, 1, 1};
//        System.out.println(Arrays.toString(sortZeroOneTwo(nums2)));
        System.out.println(Arrays.toString(sortZeroOneTwo(nums)));
    }
}
