use shoppingmall;

# 모든 제품을 조회하는 쿼리
select * from product;

# 금액이 1만원 이상인 제품을 조회하는 쿼리
select * from product where pr_price > 10000;

# 제품명에 시원한이 들어간 제품을 조회하는 쿼리
select * from product where pr_name like concat('%', '시원한', '%');

# 카테고리가 옷인 제품을 조회하는 쿼리
select * from product where pr_ca_num = 1;

# 금액과 제품명을 이용해서 검색하는 쿼리를 일반화해서 만들어보세요.
select * from product where pr_name like concat('%', '', '%') and pr_price >= 10000;
select * from product where pr_name like concat('%', '', '%') and pr_price >= 10000 and pr_ca_num= 1;

# 카테고리별 제품의 평균 가격을 조회하는 쿼리
select ca_name 카테고리, format(ifnull(avg(pr_price), 0), 0) '평균 가격' from category 
left join product on pr_ca_num = ca_num 
group by ca_num;

# 카테고리별 제품의 평균 가격이 3만원 이상인 카테고리를 조회
select ca_name 카테고리 from category 
left join product on pr_ca_num = ca_num 
group by ca_num
having ifnull(avg(pr_price), 0) >= 30000;

# 카테고리별 등록된 제품 수를 조회
select ca_name 카테고리, count(pr_ca_num) '제품 수' from category 
left join product on pr_ca_num = ca_num 
group by ca_num;

# 'abc123' 회원이 구매한 제품 정보를 조회
select product.* from buy join product on bu_pr_code = pr_code where bu_me_id = 'abc123' and bu_state in ('구매', '구매 확정');

#'abc123' 회원의 누적 구매 금액을 조회
select bu_me_id '회원 ID', format(sum(pr_price * bu_amount), 0) '누적 금액' from product 
join buy on bu_pr_code = pr_code where bu_me_id = 'abc123' and bu_state in ('구매', '구매 확정');

# abc123 회원이 장바구니에 1번 제품(CLO001) 3개를 담았을 때 쿼리
insert into basket(ba_pr_code, ba_me_id, ba_amount) values('CLO001', 'abc123', '3');

# abc123 회원이 장바구니에 1번 제품(CLO001) 2개를 담았을 때 쿼리
update basket set ba_amount = 2 where ba_pr_code = 'CLO001' and ba_me_id = 'abc123';

# abc123 회원이 장바구니에 있는 1번 제품(CLO001)을 2개 구매했을 때 쿼리
insert into buy(bu_pr_code, bu_me_id, bu_amount, bu_state, bu_date) values('CLO001', 'abc123', 2, '구매', now());
delete from basket where ba_pr_code = 'CLO001' and ba_me_id = 'abc123';