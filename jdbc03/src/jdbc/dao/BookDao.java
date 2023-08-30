package jdbc.dao;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BookDto;
import jdbc.mapper.BookMapper;
import jdbc.util.JdbcUtils;

public class BookDao {
	public void insert(BookDto dto) {
		String sql = "insert into book(book_id, book_title, book_author, "
						+ "book_publication_date, book_price, book_publisher, "
						+ "book_page_count, book_genre) "
						+ "values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {dto.getBookTitle(), dto.getBookAuthor(), 
							dto.getBookPublicationDate(), dto.getBookPrice(), 
							dto.getBookPublisher(),dto.getBookPageCount(), dto.getBookGenre()};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
	//가격 수정
	public boolean updateBookPrice(BookDto dto) {
		String sql = "update book set book_price=? where book_id=?";
		Object[] data = {dto.getBookPrice(), dto.getBookId()};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql, data) > 0;
	}
	//나머지 정보 수정
	public boolean updateBookInfo(BookDto dto) {
		String sql = "update book set book_title=?, book_author=?, "
							+ "book_publisher=? where book_id=?";
		Object[] data = {dto.getBookTitle(), dto.getBookAuthor(), 
							dto.getBookPublisher(), dto.getBookId()};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//도서 삭제
	public boolean delete(int bookId) {
		String sql = "delete book where book_id=?";
		Object[] data = {bookId};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
	}
	
	private BookMapper mapper = new BookMapper();
	//도서 목록
	public List<BookDto> selectList(){
		String sql = "select * from book order by book_id asc";
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper);
	}
	public List<BookDto> selectListByPage(int page, int size){
		int end = page * size;
		int begin = end = (size-1);
		
		String sql = "select * from ("
						+ "select rownum rn, TMP.* from("
							+ "select * from book order by book_id asc"
						+ ")TMP"
					+ ") where rn between ? and ?";
		Object[] data = {begin, end};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper, data);
	}
	
	public BookDto selectOne(int bookId) {
		String sql = "select * from book where book_id=?";
		Object[] data = {bookId};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<BookDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

}