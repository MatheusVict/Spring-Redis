CREATE TABLE IF NOT EXISTS company
(
    id
    INT
    PRIMARY
    KEY,
    name
    varchar
(
    20
));

CREATE
OR REPLACE FUNCTION populaDB()
RETURNS VOID AS '
DECLARE
    cont INT := 1;
    registros INT := 0;
BEGIN
    SELECT COUNT(*) INTO registros FROM company;
    IF registros = 0 THEN
        FOR cont IN 1..300000 LOOP
            INSERT INTO company (id, name)
            VALUES (cont, CONCAT(''Empresa '', cont));
        END LOOP;
    END IF;
END;
'
LANGUAGE plpgsql;

SELECT populaDB();