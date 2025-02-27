package com.simple.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simple.board.BoardVO;
import com.simple.common.JDBCUtil;

public class BoardDAO {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	// SQL 문장 준비
	private final String BOARD_INSERT = "INSERT INTO board (seq,title,writer,content)"
			+ " VALUES(SELECT nvl(max(seq),0)+1 from board), ?,?,?);";
	private final String BOARD_UPDATE = "UPDATE BOARD SET title=?, content=? WHERE seq=?;";
	private final String BOARD_DELETE = "DELETE BOARD WHERE seq=?;";
	private final String BOARD_GET = "SELECT * FROM board WHERE seq=?;";
	private final String BOARD_LIST = "SELECT * FROM board ORDER BY seq DESC;";

	// SQL 처리 함수 생성
	public void insertBoard(BoardVO vo) {
		System.out.println("==>JDBC로 insertBoard() 기능처리 ");
		// DB 접속
		// 문장객체 생성
		// SQL 전송(실행)

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_INSERT);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			// SQL 실행
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}

	}

	// SQL 처리 함수 생성
	public void deleteBoard(BoardVO vo) {
		System.out.println("==>JDBC로 deleteBoard() 기능처리 ");
		// DB 접속
		// 문장객체 생성
		// SQL 전송(실행)

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_DELETE);
			pstmt.setInt(1, vo.getSeq());
			// SQL 실행
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}

	}

	// SQL 처리 함수 생성
	public void updateBoard(BoardVO vo) {
		System.out.println("==>JDBC로 updateBoard() 기능처리 ");
		// DB 접속
		// 문장객체 생성
		// SQL 전송(실행)

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getSeq());
			// SQL 실행
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}

	}

	// SQL 처리 함수 생성
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("==>JDBC로 getBoard() 기능처리 ");
		BoardVO board = null;
		// DB 접속
		// 문장객체 생성
		// SQL 전송(실행)

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_GET);
			pstmt.setInt(1, vo.getSeq());
			// SQL 실행
			rs = pstmt.executeQuery();

			// SQL 실행 결과 처리
			if (rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}

		return board;

	}

	// SQL 처리 함수 생성
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("==>JDBC로 getBoardList() 기능처리 ");
		List<BoardVO> boardList = new ArrayList<>();
		
		// DB 접속
		// 문장객체 생성
		// SQL 전송(실행)

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_LIST);
			pstmt.setInt(1, vo.getSeq());
			// SQL 실행
			rs = pstmt.executeQuery();

			// SQL 실행 결과 처리
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				
				boardList.add(board);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}

		return boardList;

	}

}
