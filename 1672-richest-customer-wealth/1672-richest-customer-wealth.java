class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; // Initialize a variable to track the maximum wealth

        // Loop through each person (row)
        for (int person = 0; person < accounts.length; person++) {
            int currentWealth = 0; // Reset sum for the current person
            
            // Loop through each account (column) for the current person
            for (int account = 0; account < accounts[person].length; account++) {
                currentWealth += accounts[person][account];
            }
            
            // Update the maximum wealth found so far
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        
        return maxWealth;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna