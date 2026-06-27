-- Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates.

CREATE TABLE Customers (
    customerId NUMBER PRIMARY KEY,
    customerName VARCHAR2(30),
    age NUMBER,
    interestRate NUMBER
);

INSERT INTO Customers VALUES (101,'Kundana',65,8);
INSERT INTO Customers VALUES (102,'Nissita',45,9);
INSERT INTO Customers VALUES (103,'Sruthi',70,7);
INSERT INTO Customers VALUES (104,'Sai Sri',30,10);

COMMIT;

BEGIN

    UPDATE Customers
    SET interestRate = interestRate - 1
    WHERE age > 60;

    COMMIT;

END;
/

SELECT customerId,
       customerName,
       interestRate
FROM Customers;