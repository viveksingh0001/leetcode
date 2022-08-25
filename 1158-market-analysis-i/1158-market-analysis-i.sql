# Write your MySQL query statement below

# select u.user_id as buyer_id, u.join_date, count(o.order_date) as orders_in_2019 from users u left join orders o on u.user_id = o.buyer_id and year(o.order_date) = '2019' group by buyer_id;


select u.user_id as buyer_id, u.join_date, count(o.order_id) as orders_in_2019
from Users u
left join Orders o on o.buyer_id = u.user_id and o.order_date > '2018-12-31' and o.order_date < '2020-01-01'
group by u.user_id;
