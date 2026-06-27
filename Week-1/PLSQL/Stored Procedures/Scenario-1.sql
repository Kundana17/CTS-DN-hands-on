-- Write a stored procedure ProcessMonthlyInterest that calculates and updates the balance of all savings accounts by applying an interest rate of 1% to the current balance.

CREATE TABLE Accounts (
    accountId NUMBER PRIMARY KEY,
    customerName VARCHAR2(30),
    balance NUMBER
);

INSERT INTO Accounts VALUES (101,'Kundana',20000);
INSERT INTO Accounts VALUES (102,'Nissita',15000);

COMMIT;

CREATE OR REPLACE PROCEDURE TransferMoney(
    fromAcc NUMBER,
    toAcc NUMBER,
    amt NUMBER
)
IS
BEGIN

    UPDATE Accounts
    SET balance = balance - amt
    WHERE accountId = fromAcc;

    UPDATE Accounts
    SET balance = balance + amt
    WHERE accountId = toAcc;

    COMMIT;

END;
/

BEGIN
    TransferMoney(101,102,5000);
END;
/

SELECT *
FROM Accounts;