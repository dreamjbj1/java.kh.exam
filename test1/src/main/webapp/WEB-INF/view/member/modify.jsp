<%@page import="test1.jdbckh.member.model.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록조회/수정</title>
</head>
	<style>
		h2{
			text-align: center;
				
		}
		.container{
			display: flex;
  			justify-content: center; 
  			align-items: center; 
 			margin: 100px 0;
 			
		}
		#button{
			border: 1px solid #000;
			text-align: center;
	</style>
<body>
<jsp:include page="/WEB-INF/view/header.jsp" />
	<h2>회원목록조회/수정</h2>

	<div class="container">
	<form action="<%=request.getContextPath() %>/member/modify.do" method="post">
		<table border="1">
			<tr>
				<th>회원번호(자동생성)</th>
				<td><input type="text" name="custNo" value="${mvo.custNo}" readonly></td>
			</tr>
				<tr>
				<th>회원성명</th>
				<td><input type="text" name="custName" value="${mvo.custName}"></td>
			</tr>
				<tr>
				<th>회원전화</th>
				<td><input type="text" name="phone"  value="${mvo.phone}"></td>
			</tr>
				<tr>
				<th>회원주소</th>
				<td><input type="text" name="address" value="${mvo.address}"></td>
			</tr>
			</tr>
			<tr>
    		<th>가입일자 yyyy-mm-dd</th>
    		<td><input type="date" id="joinDateInput" name="joinDate" value="${mvo.joinDate} onchange="removeTimeFromDateInput();"></td>
			</tr>
		<%-- 		<tr>
				<th>가입일자</th>
				<td><input type="text" name="joinDate" value="${mvo.joinDate}"></td>
			</tr> --%>
			<tr>
    	<th>고객등급[A:VIP,B:일반,C:직원]</th>
    	<td>
        <select name="grade">
            <option value="VIP" selected>A</option>
            <option value="일반">B</option>
            <option value="직원">C</option>
        </select>
    </td>
	</tr>	
				<tr>
				<td>도시코드</td>
				<td><input type="text" name="city" value="${mvo.city}"></td>
			</tr>
		</table>
		<div id="button">
    		<button type="submit" onclick="return Check();">수정</button>
    		<button type="button" onclick="moveList();">홈으로</button>
		</div>
	</form>
	</div>
<jsp:include page="/WEB-INF/view/footer.jsp" />
</body>


<script>
function Check() {
    alert("회원정보 수정이 완료되었습니다.");
    return true;
}

function moveList() {
    location.href = "<%=request.getContextPath() %>/list";
}
</script>
</html>