package test1.jdbckh.money.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test1.jdbckh.money.dao.MoneyDao;
import test1.jdbckh.money.dto.MoneyDto;



/**
 * Servlet implementation class SalesInfoListController
 */
@WebServlet("/member/money")
public class MoneyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/sales/list doGet() 진입");
		MoneyDao dao = new MoneyDao();
		List<MoneyDto> result = dao.selectListMoney();
		request.setAttribute("MoneyList", result);
		request.getRequestDispatcher("/WEB-INF/view/member/money.jsp").forward(request, response);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}