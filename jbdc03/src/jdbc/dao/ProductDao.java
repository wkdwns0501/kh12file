package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.ProductDto;
import jdbc.util.JdbcUtils;

public class ProductDao {
	public void insert(ProductDto dto) {
		String sql = "insert into product(no, name, type, price, made, expire) "
				+ "values(product_seq.nextval, ?, ?, ? ,sysdate, sysdate+30)";
		Object[] data = {dto.getName(), dto.getType(), dto.getPrice()
								};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
	
	//상품 삭제
	public boolean delete(int no) {
		String sql = "delete product where no=?";
		Object[] data = {no};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
	}
}
