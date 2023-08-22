package test1.jdbckh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test1.jdbckh.member.service.MemberService;

/**
 * Servlet implementation class MemberInsertServlet
 */
@WebServlet("/member/insert")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service = new MemberService();	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/member/insert.jsp").forward(request, response);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
