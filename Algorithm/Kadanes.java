package Algorithm;
// Kadane's Algorithm is an efficient algorithm for finding the maximum sum of a contiguous subarray in an array of integers.
public class Kadanes {

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // this will store the maximum sum found so far
        int sum_so_far = nums[0]; // this will store the sum of the current subarray

        for(int i=0;i<nums.length;i++){
            // if the current number is greater than the sum so far, start a new subarray
            sum_so_far = Math.max(nums[i],sum_so_far + nums[i]);
            maxSum = Math.max(sum_so_far,maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); 
    }

    // Basically what we are doing in this is that jab bhi current sum chota ho
    // jaega current ellement se it means ki sum mn negative elemnts add hue honge
    // tabhi toh sum chota ho raha hai toh hum us sub array ko drop kar k current
    // element se new sub array start krenge aur yeh sb process mn hum max sum track
    // krte rahenge jo ab tak mila hai. toh usse sub array jab drop kiya toh uska sum agar max hua toh woh bhi track ho jaega.

    // Time complexity is O(n) and space complexity is O(1)
    // because we are using only a constant amount of space to store the variables.
    // The algorithm iterates through the array only once, making it efficient for large inputs.
    // This is a very efficient algorithm for finding the maximum sum of a contiguous subarray.
}