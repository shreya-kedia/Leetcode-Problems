# Write your MySQL query statement below

select  Customers.name
as Customers 
FROM Customers LEFT OUTER JOIN  Orders ON Orders.customerId=Customers.id WHERE Orders.customerId is null
