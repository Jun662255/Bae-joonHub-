-- 코드를 입력하세요
/**
SELECT BOOK_ID	,DATE_FORMAT(PUBLISHED_DATE,'%Y-%m-%d')as PUBLISHED_DATE from BOOK 
where category = '인문'
order by PUBLISHED_DATE asc
*/
select  BOOK_ID	,DATE_FORMAT(PUBLISHED_DATE,'%Y-%m-%d')as PUBLISHED_DATE from book
where category = '인문'
  and YEAR(PUBLISHED_DATE) = '2021'
order by PUBLISHED_DATE asc
