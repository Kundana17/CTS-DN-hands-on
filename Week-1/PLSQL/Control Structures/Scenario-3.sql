-- Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer.

CREATE TABLE Loans (
    loanId NUMBER PRIMARY KEY,
    customerName VARCHAR2(30),
    dueDate DATE
);

INSERT INTO Loans VALUES (101,'Kundana',SYSDATE + 10);
INSERT INTO Loans VALUES (102,'Nissita',SYSDATE + 45);
INSERT INTO Loans VALUES (103,'Sai Sri',SYSDATE + 20);
INSERT INTO Loans VALUES (104,'Aakanksha',SYSDATE + 60);

COMMIT;

SET SERVEROUTPUT ON;

BEGIN

    FOR rec IN (
        SELECT customerName, dueDate
        FROM Loans
        WHERE dueDate <= SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder sent to ' || rec.customerName
        );
    END LOOP;

END;
/