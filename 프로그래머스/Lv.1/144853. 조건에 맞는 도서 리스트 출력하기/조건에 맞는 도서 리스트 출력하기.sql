-- 코드를 입력하세요
SELECT BOOK_ID, to_char(PUBLISHED_DATE, 'yyyy-mm-dd') as published_date
FROM BOOK
where to_char(published_date ,'yyyy') = '2021' and category = '인문'
order by PUBLISHED_DATE asc