-- 코드를 입력하세요
SELECT COUNT(*)
FROM (
    SELECT DISTINCT NAME
    FROM ANIMAL_INS
    WHERE NAME IS NOT NULL
)
