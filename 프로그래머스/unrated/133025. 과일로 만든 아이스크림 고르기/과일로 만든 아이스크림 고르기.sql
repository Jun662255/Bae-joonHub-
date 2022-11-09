-- 코드를 입력하세요
-- 상반기 아이스크림 총주문량이 3,000보다 높으면서;
-- 아이스크림의 주 성분이 과일인;
--  아이스크림의 맛을 총주문량이 큰 순서대로 ;


SELECT f.FLAVOR
 FROM FIRST_HALF f, ICECREAM_INFO i
WHERE f.FLAVOR = i.FLAVOR 
  AND ingredient_type = 'fruit_based'
  AND total_order >=3000
ORDER BY total_order DESC;