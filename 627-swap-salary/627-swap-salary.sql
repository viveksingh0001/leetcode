# Write your MySQL query statement below
Update salary set sex =
case when sex = 'm' then 'f'
else 'm' end;