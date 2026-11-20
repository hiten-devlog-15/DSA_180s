import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        Brute
        List<List<Integer>> triplet = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if(!triplet.contains(list)){
                            triplet.add(list);
                        }
                    }
                }
            }
        }
        return triplet;


    }
    public static void main(String[] args) {
        int[] nums = {2, -2, 0, 3, -3, 5};
        int[] nums2 = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums2));
    }
}
