package com.koreait.board2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v2/SerBoardMod")
public class SerBoardMod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_board = Utils.getIntParam(request, "i_board");
		if(i_board == 0) {
			response.sendRedirect("/v2/SerBoardList");
		}
		System.out.println(i_board);
		
		BoardDAO2 dao = BoardDAO2.getInstatance();
		BoardDTO dto = dao.selBoard(i_board);
		
		request.setAttribute("item", dto);
		
		Utils.forward("boardMod", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
