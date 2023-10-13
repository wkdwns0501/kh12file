package com.kh.spring15.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
			//기본생성자			//모든항목에 대한 생성자//빌더
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BookDto {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublicationDate;
	private float bookPrice;
	private String bookPublisher;
	private int bookPageCount;
	private String bookGenre;
}
