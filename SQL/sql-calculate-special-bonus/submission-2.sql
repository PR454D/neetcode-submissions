-- Write your query below
select e.employee_id,
case when e.employee_id % 2 != 0 and e.name not like 'M%'
    then e.salary
    else '0' end
    as bonus
from employees e
order by e.employee_id;