public class MajorityElement1 {
    public int majorityElement(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     int cnt = 0;
        //     for(int j = i; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             cnt++;
        //         }
        //         if(cnt > (nums.length/2)){
        //             return nums[i];
        //         }
        //     }
        // }

//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            if(!map.containsKey(nums[i])){
//                int count = 1;
//                map.put(nums[i], count);
//            }
//            else {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
//        for (int num : nums) {
//            if (map.get(num) > nums.length / 2) {
//                return num;
//            }
//        }

//        Arrays.sort(nums);
//        int count = 0;
//        for(int i = 0; i < nums.length; i++){
//            if(i == 0){
//                count = 1;
//            }
//            if(nums[i] == nums[i-1]){
//                count++;
//            }
//            if(nums[i] != nums[i-1]){
//                count = 1;
//            }
//            if(count > nums.length/2){
//                return nums[i];
//            }
//        }

        int count = 0;
        int candidate = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }

            if(candidate == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        count = 0;
        for(int element : nums){
            if(element == candidate){
                count++;
            }
            if(count> nums.length/2){
                return candidate;
            }
        }

        return -1;
    }

}
