package test1.jdbckh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test1.jdbckh.member.model.dto.MemberDto;
import test1.jdbckh.member.service.MemberService;

/**
 * Servlet implementation class CustomerInsertServlet
 */
@WebServlet("/member/modify")
public class MemberModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String custNoStr = request.getParameter("custNo");
		int custNo = 0;
		try {
			custNo = Integer.parseInt(custNoStr);
		} catch (NumberFormatException e) {
		}
		

        MemberService memberService = new MemberService();
        MemberDto mvo = memberService.selectOne(custNo);
        request.setAttribute("mvo", mvo); // 수정된 부분
        request.getRequestDispatcher("/WEB-INF/view/member/modify.jsp").forward(request, response);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
