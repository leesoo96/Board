package com.koreait.board;

import java.util.ArrayList;
import java.util.List;

// DB와 통신(Data Access)
public class BoardDAO {
	
	private List<BoardVO> list;
	
	private static BoardDAO dao;
	
//	무조건 객체 하나만 생성 - 싱글톤 패턴. 외부에서 객체화안되도록 해야함. private으로 접근제한자를 붙여주면 된다
	private BoardDAO() {
		list = new ArrayList();
		
		list.add(new BoardVO(1, "안녕", "JSP..", "11-23", "11-23"));
		list.add(new BoardVO(2, "잘가", "JSP~~", "11-24", "11-24"));
		list.add(new BoardVO(3, "안녕?", "JSP!!", "11-25", "11-25"));
	}
	
	public static BoardDAO getInstatance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}
	
//	주소값 하나만 읽어옴
	public List<BoardVO> selBoardList(){
		return list;
	}
	
//	add된 값 읽어옴
	public BoardVO selBoard(int i_board) {
		for(BoardVO vo : list) {
			if(vo.getI_board() == i_board) {
				return vo;
			}
		}
		return null;
	}
}
