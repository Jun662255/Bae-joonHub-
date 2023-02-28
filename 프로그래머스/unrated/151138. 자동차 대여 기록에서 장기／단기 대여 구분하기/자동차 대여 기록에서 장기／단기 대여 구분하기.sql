-- 코드를 입력하세요
SELECT 
        HISTORY_ID, 
        CAR_ID, 
        DATE_FORMAT(start_date, '%Y-%m-%d') AS start_date, 
        DATE_FORMAT(END_DATE, '%Y-%m-%d') AS END_DATE,
        CASE WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 30 THEN '장기 대여'
        ELSE '단기 대여' END AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 

WHERE date_format(start_date, '%Y%m')='202209'
ORDER BY HISTORY_ID DESC