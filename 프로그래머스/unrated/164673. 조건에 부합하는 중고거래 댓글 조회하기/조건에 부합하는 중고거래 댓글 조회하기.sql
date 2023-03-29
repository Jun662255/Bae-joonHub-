-- 코드를 입력하세요
/*
SELECT A.BOARD_ID
     , WRITER_ID
     , TITLE
     , CONTENTS
     , PRICE
     , CREATED_DATE
     , STATUS
     , VIEWS
  FROM USED_GOODS_BOARD.A
  JOIN USED_GOODS_REPLY.B
    ON A.BOARD_ID = B.BOARD_ID
*/
SELECT TITLE
     , A.BOARD_ID
     , REPLY_ID
     , B.WRITER_ID
     , B.CONTENTS
     , DATE_FORMAT(B.CREATED_DATE,'%Y-%m-%d') CREATED_DATE
     -- , B.CREATED_DATE
  FROM USED_GOODS_BOARD A
  JOIN USED_GOODS_REPLY B
    ON A.BOARD_ID = B.BOARD_ID
 WHERE DATE_FORMAT(A.CREATED_DATE,'%Y-%m') = '2022-10'
 ORDER BY B.CREATED_DATE ASC , TITLE ASC