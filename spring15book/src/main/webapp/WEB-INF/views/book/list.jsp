<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form>
	<div>도서번호<input type="text" name="bookId" value="${vo.bookId}"></div>
	<div>도서제목<input type="text" name="bookTitle" value="${vo.bookTitle}"></div>
	<div>도서저자<input type="text" name="bookAuthor" value="${vo.bookAuthor}"></div>
	<div>출판사<input type="text" name="bookPublisher" value="${vo.bookPublisher}"></div>
	<div>
		출간일
		<input type="date" name="bookPublicationBegin" value="${vo.bookPublicationBegin}">
		~
		<input type="date" name="bookPublicationEnd" value="${vo.bookPublicationEnd}">
	</div>
	<div>
		판매가
		<input type="number" name="bookPriceMin" value="${vo.bookPriceMin}">부터
		<input type="number" name="bookPriceMax" value="${vo.bookPriceMax}">까지
	</div>
	<div>
		페이지
		<input type="number" name="bookPageMin" value="${vo.bookPageMin}">이상
		<input type="number" name="bookPageMax" value="${vo.bookPageMax}">이하
	</div>
	<div>
		장르
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('공포')} ">
				<input type="checkbox" name="bookGenreList" value="공포" checked> 공포			
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="공포"> 공포		
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('스릴러')} ">
				<input type="checkbox" name="bookGenreList" value="스릴러" checked>스릴러		
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="스릴러">스릴러		
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Fantasy')} ">
				<input type="checkbox" name="bookGenreList" value="Fantasy" checked>Fantasy		
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Fantasy">Fantasy		
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Classic')} ">
				<input type="checkbox" name="bookGenreList" value="Classic" checked>Classic		
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Classic">Classic	
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Romance')} ">
				<input type="checkbox" name="bookGenreList" value="Romance" checked>Romance			
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Romance">Romance	
			</c:otherwise>
		</c:choose>
	</div>
	
	<!-- 정렬 -->
	<div>
		1차 정렬
		<select name="orderList">
			<option value="">선택하세요</option>
			<option value="book_id asc">번호순</option>
			<option value="book_price desc">비싼 가격순</option>
			<option value="book_price asc">저렴한 가격순</option>
			<option value="book_publication_date desc">최근 출간 순</option>
		</select>
	</div>
	<div>
		2차 정렬
		<select name="orderList">
			<option value="">선택하세요</option>
			<option value="book_id asc">번호순</option>
			<option value="book_price desc">비싼 가격순</option>
			<option value="book_price asc">저렴한 가격순</option>
			<option value="book_publication_date desc">최근 출간 순</option>
		</select>
	</div>
	
	<button type="submit">검색</button>
</form>

<hr>

<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>저자</th>
			<th>출판사</th>
			<th>출간일</th>
			<th>판매가</th>
			<th>페이지</th>
			<th>장르</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="bookDto" items="${list}">
		<tr>
			<td>${bookDto.bookId}</td>
			<td>${bookDto.bookTitle}</td>
			<td>${bookDto.bookAuthor}</td>
			<td>${bookDto.bookPublisher}</td>
			<td>${bookDto.bookPublicationDate}</td>
			<td>${bookDto.bookPrice}</td>
			<td>${bookDto.bookPageCount}</td>
			<td>${bookDto.bookGenre}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
