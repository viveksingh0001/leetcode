# Write your MySQL query statement below
select user_id, CONCAT(UCASE(SUBSTRING(name, 1, 1)), LCASE(SUBSTRING(name,2, LENGTH(name)))) as name from users order by user_id;