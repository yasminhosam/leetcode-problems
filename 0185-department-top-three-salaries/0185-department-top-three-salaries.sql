WITH RankedSalaries AS (
    SELECT 
        Department.name AS Department, 
        Employee.name AS Employee, 
        Employee.salary AS Salary,
        DENSE_RANK() OVER (PARTITION BY Employee.departmentId ORDER BY Employee.salary DESC) AS rnk
    FROM Employee
    INNER JOIN Department
        ON Employee.departmentId = Department.id
)

SELECT Department, Employee, Salary
FROM RankedSalaries
WHERE rnk <= 3;