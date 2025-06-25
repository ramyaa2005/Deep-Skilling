
BEGIN
    DECLARE
        temperature NUMBER := 40;
    BEGIN
        IF temperature < 20 THEN
            DBMS_OUTPUT.PUT_LINE('Cold Weather');
        ELSIF temperature BETWEEN 20 AND 35 THEN
            DBMS_OUTPUT.PUT_LINE('Normal Weather');
        ELSE
            DBMS_OUTPUT.PUT_LINE('Hot Weather');
        END IF;
    END;
END;
/

BEGIN
    DECLARE
        dept_id NUMBER := 10;
        dept_name VARCHAR2(20);
    BEGIN
        CASE dept_id
            WHEN 10 THEN dept_name := 'HR';
            WHEN 20 THEN dept_name := 'Finance';
            WHEN 30 THEN dept_name := 'Engineering';
            ELSE dept_name := 'Unknown';
        END CASE;

        DBMS_OUTPUT.PUT_LINE('Department: ' || dept_name);
    END;
END;
/

BEGIN
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('FOR LOOP: Square of ' || i || ' is ' || i*i);
    END LOOP;
END;
/

BEGIN
    DECLARE
        num NUMBER := 1;
    BEGIN
        WHILE num <= 5 LOOP
            DBMS_OUTPUT.PUT_LINE('WHILE LOOP: Number = ' || num);
            num := num + 1;
        END LOOP;
    END;
END;
/

BEGIN
    DECLARE
        i NUMBER := 1;
        sum NUMBER := 0;
    BEGIN
        LOOP
            EXIT WHEN i > 5;
            sum := sum + i;
            i := i + 1;
        END LOOP;
        DBMS_OUTPUT.PUT_LINE('Sum of first 5 numbers = ' || sum);
    END;
END;
/

BEGIN
    DECLARE
        val NUMBER := 5;
    BEGIN
        IF val = 5 THEN
            GOTO skip_block;
        END IF;

        DBMS_OUTPUT.PUT_LINE('This line will be skipped.');

        <<skip_block>>
        DBMS_OUTPUT.PUT_LINE('GOTO: Jumped to label successfully.');
    END;
END;
/

BEGIN
    DECLARE
        value NUMBER := 100;
    BEGIN
        IF value < 50 THEN
            DBMS_OUTPUT.PUT_LINE('Value is below 50');
        ELSE
            NULL; -- do nothing
        END IF;

        DBMS_OUTPUT.PUT_LINE('Program ended.');
    END;
END;
/
