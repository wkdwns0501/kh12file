package com.kh.spring22.dto;

import javax.validation.constraints.Pattern;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "도서")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class BookDto {
	
	@Schema(description = "도서번호(등록시x)")
    private int bookId;
	
	@Schema(description = "도서제목", example = "그대는")
   private String bookTitle;
	
	@Pattern(regexp = "[^!@#$]+")
	@Schema(description = "도서작가", example = "재민시치")
   private String bookAuthor;
	
	@Pattern(regexp = "^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$")
	@Schema(description = "출판일", example = "2000-10-02")
   private String bookPublicationDate;
	
	@Schema(description = "도서가격", example = "99.99")
	@Builder.Default
   private float bookPrice = -1f;
	
	@Schema(description = "출판사", example = "재민시치회사")
   private String bookPublisher;
	
	@Schema(description = "페이지수", example = "300")
   private int bookPageCount;
	
	@Schema(description = "도서장르", example = "판타지"
			, allowableValues = {"공포", "예능", "스릴러", "판타지", "클래식", "로맨스", "픽션"})
   private String bookGenre;
   
   @Schema(hidden = true)
	public boolean isEmpty() {
		return bookId == 0 && bookTitle == null && bookAuthor == null 
				&& bookPublicationDate == null && bookPrice == 0 && bookPublisher == null 
				&& bookPageCount == 0 && bookGenre == null;
	}
	
}
