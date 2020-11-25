package com.koreait.board2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v2/SerBoardList")
public class SerBoardList extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*		String boardListPath = "/WEB-INF/JSP2/boardList.jsp";
		request.getRequestDispatcher(boardListPath).forward(request, response);
*/		
		Utils.forward("boardList", request, response);
		
		BoardDAO2 dao2 = BoardDAO2.getInstatance();
		List<BoardDTO> list =  dao2.selBoardList();
		request.setAttribute("list", list);
	}
}
