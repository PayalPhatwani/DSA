package Greedy;
// leetcode problem link: https://leetcode.com/problems/jump-game/
// i understand the problem from here: https://www.youtube.com/watch?v=tZAa_jJ3SwQ&ab_channel=takeUforward
public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxIndex=0;

        for(int i=0;i<nums.length;i++){
            if(maxIndex<i){
                return false;
            } 

            if(maxIndex==nums.length-1) return true;
            maxIndex = Math.max(maxIndex,i+nums[i]);
        }


        return true;
    }   
     public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2,3,1,1,4};
        System.out.println(jumpGame.canJump(nums)); // Output: true
    }
}

// at every index we are checking what maximum index we can reach from that index (that's why it is called greedy approach because 
// we are always trying to reach the maximum index possible from the current index) and if at any point the maximum index is less than the current index
// then we cannot reach the end of the array and we return false. If we reach the end of the array then we return true.
// Time complexity is O(n) and space complexity is O(1) because we are using only a constant amount of space to store the variables.
// The algorithm iterates through the array only once, making it efficient for large inputs.
// hum har ek index par check kar rahe hai ki us index pe reh kar kitna max ja skte hai and us maxindex ko store kar rahe hai,
// suppose hamara max index agar kam hota hai current index se toh iska matlab hum us index tak nahi pahuch paye and it means ki hum last 
// index tak nahi pahuch payenge toh hum false return kar denge.
// agar hum last index tak pahuch gaye toh hum true return kar denge.
