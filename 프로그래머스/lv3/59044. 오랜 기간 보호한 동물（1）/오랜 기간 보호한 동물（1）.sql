-- 코드를 입력하세요

SELECT a.name, a.datetime
 from ANIMAL_INS a 
 left join ANIMAL_OUTS b  
   on a.ANIMAL_ID = b.ANIMAL_ID
WHERE a.animal_id IS not NULL and b.ANIMAL_ID IS NULL
ORDER BY a.datetime
limit 3

