<%@page import="test1.jdbckh.money.dto.MoneyDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원매출조회</title>
	<style>
 	#title{
		background-color: lightgray;
		text-align: center;
		margin: -10px;
		height: 40px;
		line-height: 40px;
	} 
	.container{
			display: flex;
  			justify-content: center; 
  			align-items: center; 
 			margin: 100px 0;
 			
		}
	  table {
        width: 80%; 
        border-collapse: collapse; 
        margin-top: 20px;
    }
    
    th, td {
        border: 1px solid black; 
        padding: 8px; 
        text-align: center;
    }
	</style>
</head>
<body>
<jsp:include page="/WEB-INF/view/header.jsp" />

	<h2 id = "title">회원매출조회</h2>
	<%
	List<MoneyDto> volist = (List<MoneyDto>)request.getAttribute("MoneyList");
	%>
	<div class="container">
	<table border="1">
	<tr>
		<td>회원번호</td>
		<td>회원이름</td>
		<td>등급</td>
		<td>총합</td>
		</tr>
		
		<%
				for(int i=0; i<volist.size(); i++) {
					MoneyDto vo = volist.get(i);
				%>
		<tr>
			<td><%=vo.getCustNo() %></td>
			<td><%=vo.getCustName() %></td>
			<td><%=vo.getGrade() %></td>
			<td><%=vo.getTotal() %></td>	
		</tr>
		<%
		}
		%>
	</table>
	</div>
<jsp:include page="/WEB-INF/view/footer.jsp" />
</body>
</html>