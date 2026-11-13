import java.util.ArrayList;
import java.util.List;

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
            if(count >= nums.length/2){
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(majorityElementTwoBrute(nums));
    }
}
