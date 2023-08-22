package test1.jdbckh.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test1.jdbckh.member.model.dao.MemberDao;
import test1.jdbckh.member.model.dto.MemberDto;

/**
 * Servlet implementation class CustomerInfoListController
 */
@WebServlet("/member/list")
public class MemberListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		System.out.println("/member/list doGet()");
		MemberDao dao = new MemberDao();
		List<MemberDto> result = dao.MemberList();
		request.setAttribute("MemberList", result);
		request.getRequestDispatcher("/WEB-INF/view/member/list.jsp").forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
