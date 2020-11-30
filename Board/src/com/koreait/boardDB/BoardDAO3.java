package com.koreait.boardDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO3 {
	
	public static int insBoard(BoardDTO3 dto) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = " INSERT INTO board_1 " + " ( title, ctnt ) " +
					 " VALUES " + " ( ?, ? ) ";
		
		try {
			conn = DBUtils.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, dto.getTitle());
			pstmt.setNString(2, dto.getCtnt());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, pstmt);
		}
		
		return result;
	}
	
	public static List<BoardDTO3> selBoardList(){
		List<BoardDTO3> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = " SELECT * FROM board_1 ORDER BY t_board DESC ";
//		DESC 뒤에 ; 를 붙여주면 Injection 공격이 가능하게 되기때문에 절대 붙이지않는다!!!!
//		Injection -> 임의의 SQL 문을 주입하고 실행되게 하여 데이터베이스가 비정상적인 동작을 하도록 조작하는 행위
		
		try {
			conn = DBUtils.getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int i_board = rs.getInt("i_board");
				String title = rs.getString("title");
				String ctnt = rs.getString("ctnt");
				String r_dt = rs.getString("r_dt");
				
				BoardDTO3 dto = new BoardDTO3();
				dto.setI_board(i_board);
				dto.setTitle(title);
				dto.setCtnt(ctnt);
				dto.setR_dt(r_dt);
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
	public BoardDTO3 selBoard(int i_board) {
		return null;
	}
	
	public void delBoard(int i_board) {
		
	}
	
	public void upBoard(BoardDTO3 param) {
		
	}
}
