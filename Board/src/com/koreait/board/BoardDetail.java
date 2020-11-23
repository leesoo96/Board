package com.koreait.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Page만들때마다 서블릿도 추가로 만들어줘야한다!!!!!!!!!!!! 대소문자 구분 O
@WebServlet("/BoardDetail")
public class BoardDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		키 값을 정수로 줬지만 html에는 정수라는 개념이 없다. 그래서 String으로 받아야한다
//		정수형은 파싱해서 형변환해서 받으면 된다
		String i_board = request.getParameter("i_board");

		String detailPath = "/WEB-INF/JSP/boardDetail.jsp";
		request.getRequestDispatcher(detailPath).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
// JSP파일로 절대 열지않고 서블릿으로 연다!!!!!!!!!!!!!!!!!!!!!