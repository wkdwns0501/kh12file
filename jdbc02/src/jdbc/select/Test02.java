package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.ProductDto;
import jdbc.mapper.ProductMapper;
import jdbc.util.JdbcUtils;

public class Test02 {
	public static void main(String[] args) {
		
		String sql = "select * from product order by no asc";
//		Object[] data = {};
		
		ProductMapper mapper = new ProductMapper();
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<ProductDto> list = jdbcTemplate.query(sql, mapper);
		
		for(ProductDto dto : list) {
			System.out.println(dto);
		}
		
	}
}
