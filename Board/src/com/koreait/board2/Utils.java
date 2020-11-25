package com.koreait.board2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Utils {
	String path;
	String request;
	String response;
	
	public static void forward(String path, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		= String jsp = "/WEB-INF/JSP2/boardList.jsp";
		String jsp = String.format("/WEB-INF/JSP2/%s.jsp", path);
		request.getRequestDispatcher(jsp).forward(request, response);
	}
}
