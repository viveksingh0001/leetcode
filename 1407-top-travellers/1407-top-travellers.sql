# Write your MySQL query statement below
select u.name, case
when sum(r.distance) is null then 0
else sum(r.distance)
end
as travelled_distance from users u left join rides r on u.id = r.user_id group by r.user_id order by travelled_distance desc, name;