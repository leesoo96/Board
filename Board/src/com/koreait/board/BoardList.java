package com.koreait.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoardList")
public class BoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	주소값에 쿼리문을 보내는 GET. 정보 노출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		response.setCharacterEncoding("UTF-8");
		
		String jspPath = "/WEB-INF/JSP/boardList.jsp";
		RequestDispatcher req = request.getRequestDispatcher(jspPath);
		req.forward(request, response);
	}

//	정보 노출 X , 보내는 내용이 길 때 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
