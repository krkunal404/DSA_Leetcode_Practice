SELECT 
    p.product_name, 
    SUM(o.unit) AS unit
FROM 
    Products p
INNER JOIN 
    Orders o 
USING (product_id)
WHERE 
    o.order_date >= '2020-02-01' AND o.order_date <= '2020-02-29'
GROUP BY 
    p.product_id
HAVING 
    SUM(o.unit) >= 100;


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna