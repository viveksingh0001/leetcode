# Write your MySQL query statement below
select employee_id, 
case when MOD(employee_id, 2)=0 then 0
    when LEFT(name, 1)='M' then 0
    else salary end
as bonus
from Employees order by employee_id;