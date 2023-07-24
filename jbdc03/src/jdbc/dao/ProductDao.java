package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.ProductDto;
import jdbc.util.JdbcUtils;

public class ProductDao {
	public void insert(ProductDto dto) {
		String sql = "insert into product(no, name, type, price, made, expire) "
				+ "values(product_seq.nextval, ?, ?, ? ,?, ?)";
		Object[] data = {dto.getName(), dto.getType(), dto.getPrice()
								, dto.getMade(), dto.getExpire()};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
}
