public class Kadane_Algorithm {
    public static int maxSubArrayBrute(int[] nums) {
        int sum = nums[0];
        for(int i = 0; i < nums.length; i++){
            int currentSum = nums[i];
            for(int j = i+1; j < nums.length; j++){
                currentSum += nums[j];
                if(currentSum > sum){
                    sum = currentSum;
                }
            }
        }
        return sum;
    }

    public static int maxSubArrayBetter(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static int maxSubArrayOptimal(int[] nums){
        int maxSum = nums[0];
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++){
            currentSum = currentSum + nums[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, -2, 7, -4};
        int[] arr = {-2, -3, -7, -2, -10, -4};
        System.out.println(maxSubArrayBetter(arr));
    }
}
