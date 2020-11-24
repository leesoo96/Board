package com.koreait.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoardReg")
public class BoardReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jspPath = "/WEB-INF/JSP/boardReg.jsp";
		request.getRequestDispatcher(jspPath).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Process(업무처리) 처리 시 주로 post 쓴다
		request.setCharacterEncoding("UTF-8");
		
		String i_board = request.getParameter("i_board");
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		System.out.printf("i_board=%s / title=%s / ctnt=%s",
							i_board, 
							title, 
							ctnt);
		
		response.sendRedirect("/BoardList");
	}
}
