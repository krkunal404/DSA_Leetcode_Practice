# Write your MySQL query statement below
SELECT 
    user_id, 
    CONCAT(
        UPPER(SUBSTR(name, 1, 1)),  LOWER(SUBSTR(name, 2))
    ) AS name
FROM Users
ORDER BY user_id;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna