public class MaximumProductInSubarray {

    public static int maxProductBrute(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int product = nums[i];
            if(product > maxProduct){
                maxProduct = product;
            }
            for(int j = i+1; j < nums.length; j++){
                product *= nums[j];
                if(product > maxProduct){
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }

    public static int maxProductBetter(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        //2, 3, -2, 4
        for(int i = 1; i < nums.length; i++){
            int current = nums[i];

            int newMax = Math.max(Math.max(current, current * maxProduct), current * minProduct);
            int newMin = Math.min(Math.min(current, current * maxProduct), current * minProduct);

            maxProduct = newMax;
            minProduct = newMin;

            if(maxProduct > result) {
                result = maxProduct;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {4, 5, 3, 7, 1, 2};
//        int[] nums = {-5, 0, -2};
//        int[] nums = {1, -2, 3, 4, -4, -3};
//        int[] nums = {-5};
//        int[] nums = {-5, 2};
        int[] nums ={2, 3, -2, 4};
//        int[] nums = {-2, 0, -1};
//        int[] nums = {-2, 3, -4};
        System.out.println(maxProductBrute(nums));
        System.out.println(maxProductBetter(nums));
    }
}
