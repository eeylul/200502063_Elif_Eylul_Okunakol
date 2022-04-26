SELECT CustomerName, City, Country, PIN
FROM Customer
ORDER BY
(CASE
    WHEN City IS NULL THEN Country
    ELSE City
END);