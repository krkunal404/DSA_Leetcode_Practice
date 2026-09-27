class Solution { 
    public char nextGreatestLetter(char[] letters, char target) { 
        int start = 0; 
        int end = letters.length - 1; 
        
        while (start <= end) { 
            int mid = start + (end - start) / 2; 
            
            if (target < letters[mid]) { 
                end = mid - 1; 
            } else if (target > letters[mid]) { 
                start = mid + 1; 
            } else { 
             
                start = mid + 1; 
            } 
        } 
        
        if (start == letters.length) {
            return letters[0];
        }
        
        return letters[start]; 
    } 
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna