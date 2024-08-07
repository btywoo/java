# 분류별 등록된 제품수를 조회하는 쿼리 
SELECT 
    CA_NAME 분류명, COUNT(PR_CODE) 제품수
FROM
    PRODUCT
RIGHT JOIN
	CATEGORY ON CA_NUM = PR_CA_NUM
GROUP BY CA_NUM;

# 분류 중에서 옷을 클릭했을 때 > 옷으로 등록된 제품들을 조회하는 쿼리
select
	*
from
	product
		JOIN
	CATEGORY ON CA_NUM = PR_CA_NUM
where
	CA_NAME = '옷';
    
# '시원한'이 들어간 제품을 검색 > 제목에 '시원한'이 포함된 제품을 조회하는 쿼리
select
	*
from
	product
where
	pr_name like concat('%','시원한','%');
    
# 누적 판매량이 가장 많은 제품들을 조회하는 쿼리
select
	dense_rank() over(order by sum(bu_amount) desc) '판매 순위', product.*, sum(bu_amount) 판매량
from
	product
		left join
	(select * from buy where bu_state in('구매', '구매 확정')) b on bu_pr_code = pr_code
group by pr_code;

# 옷 제품들 중에서 가격이 높은 순으로 제품을 조회하는 쿼리
select
	product.*
from
	product
		JOIN
	CATEGORY ON CA_NUM = PR_CA_NUM
where
	CA_NAME = '옷'
order by pr_price desc;

# abc123 회원이 구매 목록을 조회하는 쿼리
select
	distinct bu_pr_code
from
	buy
where 
	bu_me_id = 'abc123' and bu_state in('구매', '구매 확정');

# abc123 회원의 누적 구매 금액을 조회하는 쿼리
select
	bu_me_id, format(sum(pr_price * bu_amount),0) '누적 구매 금액'
from
	buy
		JOIN
	product ON bu_pr_code = pr_code
where 
	bu_me_id = 'abc123' and bu_state in('구매', '구매 확정')
group by bu_me_id;
    
# 회원별 누적 금액을 조회하는 쿼리
select
	me_id, ifnull(format(sum(pr_price * bu_amount),0), 0) '누적 구매 금액'
from
	member
		left join
	(select * from buy where bu_state in('구매', '구매 확정')) b on me_id = bu_me_id
		left join
	product ON bu_pr_code = pr_code
group by me_id;