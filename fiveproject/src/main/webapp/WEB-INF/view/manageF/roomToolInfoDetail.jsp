<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

				
		<!-- 갯수가 0인 경우  -->
		<c:if test="${wareCnt eq 0 }">
		
			<tr>
				<td colspan="6">데이터가 존재하지 않습니다.</td>
			</tr>
		</c:if>

		<!-- 갯수가 있는 경우  -->
		<c:if test="${wareCnt > 0 }">
			<c:set var="nRow" value="${pageSize*(currentPage-1)}" /> 
			<c:forEach items="${roomWareList}" var="list">
				<tr>
					    <td><a href="javascript:wareInsertBtn(${list.seq},${list.room});">${list.room}</a></td>
					    <td><a href="javascript:wareInsertBtn(${list.seq});">${list.name}</a></td>
					    <td>${list.ccount}</td>
					    <td>${list.etc}</td>
					<!-- List에 있는 js 함수 호출가능 이거 그대로 가지고 가기 때문에 !!-->
				</tr>
				 <c:set var="nRow" value="${nRow + 1}" /> 
			</c:forEach>
		</c:if>
		
		<input type="hidden" id="tooltotalCnt" value="${wareCnt}">
		<!-- 이거 중간에 있으면 table 안먹힘  -->