# Write your MySQL query statement below
SELECT mgr.employee_id,   mgr.name, 
    COUNT(emp.employee_id) AS reports_count, 
    ROUND(AVG(emp.age)) AS average_age
FROM Employees emp
INNER JOIN Employees mgr 
    ON emp.reports_to = mgr.employee_id
GROUP BY mgr.employee_id, mgr.name
ORDER BY mgr.employee_id;


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna