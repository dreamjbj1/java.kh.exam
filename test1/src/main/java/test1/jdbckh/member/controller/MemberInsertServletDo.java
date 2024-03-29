package test1.jdbckh.member.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test1.jdbckh.member.model.dto.MemberDto;
import test1.jdbckh.member.service.MemberService;

/**
 * Servlet implementation class MemberInsertServletDo
 */
@WebServlet("/member/insert.do")
public class MemberInsertServletDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService service = new MemberService();
	
//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String custNoStr = request.getParameter("custNo");
		int custNo = 0;
		try {
			custNo = Integer.parseInt(custNoStr);
		} catch (NumberFormatException e) {
		}
		String custName = request.getParameter("custName");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String joinDate = request.getParameter("joinDate");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");
		System.out.println("[!!!!!!!!!!!]");
		System.out.println(custName);

			
		
		MemberDto dto = new MemberDto();
		dto.setCustNo(custNo);
		dto.setCustName(custName);
		dto.setPhone(phone);
		dto.setAddress(address);
		dto.setJoinDate(joinDate);
		dto.setGrade(grade);
		dto.setCity(city);
		
		int result = service.insertMember(dto);
		response.sendRedirect(request.getContextPath()+"/member/list");
}

}
