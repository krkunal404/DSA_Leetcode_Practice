class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        
        for (int num : nums) {
            // Count the digits of the current number
            int digits = 0;
            int temp = num;
            while (temp > 0) {
                digits++;
                temp /= 10; // Remove the last digit
            }
            
            // If the number of digits is even, increase our count
            if (digits % 2 == 0) {
                evenCount++;
            }
        }
        
        return evenCount;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna