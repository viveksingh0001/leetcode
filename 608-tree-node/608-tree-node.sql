# Write your MySQL query statement below

select id,
case 
    when p_id is null then 'Root'
    when exists(select * from tree t where t.p_id = t1.id) then 'Inner'
    when not exists(select * from tree t where t.p_id = t1.id) then 'Leaf'
end as type
from tree t1;