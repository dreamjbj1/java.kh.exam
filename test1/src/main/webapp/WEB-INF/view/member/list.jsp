<%@page import="test1.jdbckh.member.model.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
<%@include file="/WEB-INF/view/link.jsp" %>
	<style>
	.wrap-content{
		display:flex;
  		justify-content: center; /* 수평 가운데 정렬 */
  		align-items: center; /* 수직 가운데 정렬 */
 		margin: 100px 0 ;
	}
	</style>
</head>
<body>
<jsp:include page="/WEB-INF/view/header.jsp" />

<h2 style = "text-align: center">회원목록조회/수정</h2>
	<%
		List<MemberDto> volist = (List<MemberDto>)request.getAttribute("MemberList");
	%>
<div  class="wrap-content">
	<table border = "1">
		<tr>
		<td>회원번호</td>
		<td>회원성명</td>
		<td>회원전화</td>
		<td>주소</td>
		<td>가입일자</td>
		<td>고객등급</td>
		<td>거주도시</td>
		</tr>
		
		<%
		for(int i=0; i<volist.size(); i++){
		MemberDto vo = volist.get(i);
		%>
		
		<tr>
			<td><a href="<%=request.getContextPath() %>/member/modify?custNo=<%= vo.getCustNo() %>"><%=vo.getCustNo() %></a></td>
			<td><%=vo.getCustName() %></td>
			<td><%=vo.getPhone() %></td>
			<td><%=vo.getAddress() %></td>
			<td><%=vo.getJoinDate() %></td>
			<td><%=vo.getGrade() %></td>
			<td><%=vo.getCity() %></td>
		</tr>
		<%
		}
		%>
	</table>
</div>
<jsp:include page="/WEB-INF/view/footer.jsp" />
</body>
</html>