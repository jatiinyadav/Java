-- https://www.programiz.com/sql/online-compiler/

1. SELECT

SELECT * FROM table_name
SELECT DISTINCT column_name FROM table_name


2. WHERE

SELECT * FROM table_name
WHERE condition_name

SELECT * FROM table_name
WHERE column_name BETWEEN data_name AND data_name

3. AND, OR, NOT

SELECT * FROM table_name
WHERE column_name = "data_name" AND column_name = "data_name"

WHERE column_name = "data_name" OR column_name = "data_name"

WHERE NOT column_name = "data_name"

4. ORDER BY -- Used to sort the data

SELECT * FROM table_name
ORDER BY column_name DESC 

ORDER BY column_name ASC -- Ascending by default

5. INSERT INTO -- Insert values int the table

-- To select all the columns just table_name
INSERT INTO table_name (column_name, column_name)
VALUES(data_here, data_here, data_here)

6. NULL

SELECT * FROM table_name
WHERE condition_name IS NOT NULL -- IS NULL

7. UPDATE

UPDATE table_name
SET column_name = "value", column_name = "value"
WHERE condition_name

8. DELETE

DELETE FROM table_name WHERE condition_name

9. SELECT TOP

SELECT * FROM table_name
LIMIT 3

-- Aggregate Functions
10. MIN, MAX

SELECT MIN(column_name) -- MAX(column_name)
FROM table_name

11. COUNT, SUM, AVG 

SELECT COUNT(column_name) -- SUM(column_name) -- AVG(column_name)
FROM table_name

---------------------

12. LIKE

SELECT * FROM table_name
FROM table_name
WHERE condition_name LIKE pattern

-- 1. Find values that start with "a"
    WHERE column_name LIKE "a%"

-- 2. Find values that end with "a"
    WHERE column_name LIKE "%a"

-- 3. Find values that have in between "al"
    WHERE column_name LIKE "%al%"

-- 4. Find values that start with a have atleast 2 characters
    WHERE column_name LIKE "a_%"

-- 5. Find value that start with "a" and end with "o"
    WHERE column_name LIKE "a%o"

13. JOIN

-- INNER JOIN:- Intersection of Two Tables
-- LEFT JOIN :- All the values of left table + INNER JOIN
-- RIGHT JOIN:- All the value of right table + INNER JOIN
-- FULL JOIN :- All the values + INNER JOIN

-- INNER JOIN
SELECT * FROM table_name
INNER JOIN table_name
WHERE condition_name

-- LEFT JOIN
SELECT * FROM table_name
LEFT JOIN table_name
WHERE condition_name

-- RIGHT JOIN
SELECT * FROM table_name
RIGHT JOIN table_name
WHERE condition_name

14. UNION 

-- No duplicates
SELECT * FROM table_name
UNION
SELECT * FROM table_name

-- Duplicates
SELECT * FROM table_name
UNION ALL
SELECT * FROM table_name

15. GROUP BY

SELECT COUNT(column_name)
FROM table_name
WHERE condition_name
GROUP BY column_name
ORDER BY COUNT(column_name) DESC