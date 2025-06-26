CREATE OR REPLACE PROCEDURE calculate_bonus (
    p_emp_id IN employees.emp_id%TYPE,
    p_bonus OUT NUMBER
)
AS
    v_salary employees.salary%TYPE;
    v_name   employees.emp_name%TYPE;
BEGIN
    SELECT salary, emp_name
    INTO v_salary, v_name
    FROM employees
    WHERE emp_id = p_emp_id;

    IF v_salary > 60000 THEN
        p_bonus := v_salary * 0.15;
    ELSIF v_salary BETWEEN 40000 AND 60000 THEN
        p_bonus := v_salary * 0.10;
    ELSE
        p_bonus := v_salary * 0.05;
    END IF;

    DBMS_OUTPUT.PUT_LINE('Employee: ' || v_name);
    DBMS_OUTPUT.PUT_LINE('Bonus: ' || p_bonus);

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee not found.');
        p_bonus := 0;
END;
/
DECLARE
    v_bonus NUMBER;
BEGIN
    calculate_bonus(102, v_bonus);
END;