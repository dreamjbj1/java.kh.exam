<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<header style="
	height : 80px;
	background-color: blue;
	color: white;
	text-align: center;
	line-height: 80px;
	font-size: 30px;
	margin: -10px ;
	height: 80px;">쇼핑몰 회원관리 version 1.0 ver</header>
<nav style="
	height: 60px;
	background-color: lightblue;
	color: white;
	padding-left: 20px;
	line-height: 60px;
	margin: -10px
">
    <div>
        <a href="<%=request.getContextPath() %>/member/insert">회원등록</a>
        &nbsp; &nbsp;
        <a href="<%=request.getContextPath() %>/member/list">회원목록조회/수정</a>
        &nbsp; &nbsp;
        <a href="<%=request.getContextPath() %>/member/money">회원매출조회</a>
        &nbsp; &nbsp; &nbsp; &nbsp;
        <a href="<%=request.getContextPath() %>/member/">홈으로</a>
    </div>
</nav>
<%-- <header style= " position: fixed ; top: 0px ; width: 100% ; height: 40px;
background-color: blue ; color : white; text-align: center ; line-height: 40px
font-size: 30px "> 쇼핑몰 회원관리 version 1.0 ver</header>

<nav style = " position: fixed ; top 40px ; width: 100% ; height: 20px ;
background-color: lightblue ; color: white ; line-height: 20px ; padding-left: 20px">
<div><a href="<%=request.getContextPath() %>/member/insert">회원등록</a> &nbsp; &nbsp; 
<a href="<%=request.getContextPath() %>/member/modify">회원목록조회/수정</a> &nbsp; &nbsp; 
<a href="<%=request.getContextPath() %>/member/money">회원매출조회</a> &nbsp; &nbsp; &nbsp; &nbsp; 
<a href="<%=request.getContextPath() %>/member/list">홈으로,</nav> --%>

