package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.BookDao;
import com.kh.spring22.dto.BookDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name ="도서 리액트용 백엔드", description = "도서")

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookRestController {
	
	@Autowired
	private BookDao bookDao;
	
	//목록 매핑에 대한 설명용 annotation
    @Operation(
          description = "도서 전체조회",
          responses = {
                @ApiResponse(
                      responseCode = "200",
                      description = "조회성공",
                      content = {
                            @Content(
                                  mediaType = "application/json",
                                  array = @ArraySchema(
                                        schema = @Schema(implementation = BookDto.class)
                                  )
                            )
                            
                      }
                ),
                @ApiResponse(
                      responseCode = "500",
                      description = "서버 오류",
                      content = @Content(
                            mediaType = "text/plain",
                            schema = @Schema(implementation = String.class),
                            examples = @ExampleObject("server error")
                            )
                      )
          }
    )
	
	@GetMapping("/") //전체조회
	public List<BookDto> list(){
		return bookDao.selectList();
	}
	
  //등록 매핑에 대한 설명용 annotation
    @Operation(
          description = "도서 신규 생성",
          responses= {
                @ApiResponse(
                      responseCode = "200",
                      description = "도서 생성 완료"
                ),
                @ApiResponse(
                      responseCode = "400",
                      description = "전송한 파라미터가 서버에서 요구하는 값과 다름"
                ),
                @ApiResponse(
                      responseCode = "500",
                      description = "서버 실행 중 오류가 발생한 경우"
                )
          }
       )

    
	@PostMapping("/")//등록
	public void insert(
			@Parameter(
				description = "생성할 도서 객체",
				required = true,
				schema = @Schema(implementation = BookDto.class)
			)
			@RequestBody BookDto bookDto) {//request body 직접 해석(ex : JSON)
		bookDao.insert(bookDto);
	}
    
    @Operation(
    	description = "도서 삭제"
    )
	
	@DeleteMapping("/{bookId}")//삭제
	public ResponseEntity<String> delete(@PathVariable int bookId) {
		boolean result = bookDao.delete(bookId);
		if(result) return ResponseEntity.status(200).build(); 
		else return ResponseEntity.status(404).build(); 
	}
    
    //강사님 방법
//    @DeleteMapping("/{bookId}")
//	public void delete(@PathVariable int bookId) {
//		bookDao.delete(bookId);
//	}
	
    @Operation(
        description = "도서 상세조회"
     )
    
	@GetMapping("/bookId/{bookId}") //상세조회
	public ResponseEntity<BookDto> find(@PathVariable int bookId) {
		BookDto bookDto = bookDao.selectOne(bookId);
		if(bookDto != null) {
			//return ResponseEntity.ok(pocketmonDto);
			return ResponseEntity.ok().body(bookDto);
		}
		else {
			return ResponseEntity.notFound().build(); 
		}
	}
    
    @Operation(
        description = "제목으로 검색"
     )
	
	@GetMapping("/bookTitle/{bookTitle}") //검색
	public ResponseEntity<List<BookDto>> search(@PathVariable String bookTitle) {
		List<BookDto> list = bookDao.selectListByBookTitle(bookTitle);
		if(list != null) {
			//return ResponseEntity.ok(pocketmonDto);
			return ResponseEntity.ok().body(list);
		}
		else {
			return ResponseEntity.notFound().build(); 
		}
	}
	
    @Operation(
        description = "도서 전체수정"
     )
    
	@PutMapping("/{bookId}") //전체수정
	public ResponseEntity<String> edit(@PathVariable int bookId ,
			@RequestBody BookDto bookDto) {
		boolean result = bookDao.edit(bookId, bookDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}
    
    //강사님 방법
//    @PutMapping("/{bookId}")
//	public void update(@RequestBody BookDto bookDto, @PathVariable int bookId) {
//		//bookDto에 모든 항목이 있는지 검사해야함
//		bookDao.edit(bookId, bookDto);
//	}
    
    @Operation(
        description = "도서 개별수정"
     )
	
	@PatchMapping("/{bookId}") //개별수정
	public ResponseEntity<String> editUnit(@PathVariable int bookId ,
			@RequestBody BookDto bookDto){
		if(bookDto.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		
		boolean result = bookDao.editUnit(bookId, bookDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}
    
    //강사님 방법
//    @PatchMapping("/{bookId}")
//	public void update2(@RequestBody BookDto bookDto, @PathVariable int bookId) {
//		//bookDto에 항목이 하나라도 있는지 검사해야함
//		bookDao.edit(bookId, bookDto);
//	}
	
}
