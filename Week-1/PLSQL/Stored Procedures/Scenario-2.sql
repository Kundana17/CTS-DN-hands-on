-- Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.

CREATE TABLE Employees (
    empId NUMBER PRIMARY KEY,
    empName VARCHAR2(30),
    salary NUMBER
);

INSERT INTO Employees VALUES (101,'Sruthi',35000);
INSERT INTO Employees VALUES (102,'Nakshatra',42000);
INSERT INTO Employees VALUES (103,'Cherishma',39000);

COMMIT;

CREATE OR REPLACE PROCEDURE UpdateSalary(
    eId NUMBER,
    newSalary NUMBER
)
IS
BEGIN

    UPDATE Employees
    SET salary = newSalary
    WHERE empId = eId;

    COMMIT;

END;
/

BEGIN
    UpdateSalary(102,50000);
END;
/

SELECT *
FROM Employees;