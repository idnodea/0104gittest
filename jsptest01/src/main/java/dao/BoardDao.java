package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Board;

public class BoardDao {
	private static Connection conn;
	private static BoardDao boardDao = new BoardDao();
	private BoardDao() {} // 생성자
	public static BoardDao getInstance() {
		BoardDao.getConnection();
		return boardDao;
	}
	
	private static void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
    		conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public ArrayList<Board> selectList() {
		ArrayList<Board> bList = new ArrayList<Board>();
		String bSql = "select * from board order by num desc";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(bSql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), 
						rs.getString("title"), rs.getString("content"),
						rs.getString("regtime"), rs.getInt("hits"));
				bList.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bList;
	}
	
	public Board selectOne(int num, boolean inc) {
	    Board board = null; // Board 객체를 초기화합니다.
	    String bSql = "SELECT * FROM board WHERE num = ?";
	    PreparedStatement pstmt;
	    try {
	        pstmt = conn.prepareStatement(bSql);
	        pstmt.setInt(1, num);
	        ResultSet rs = pstmt.executeQuery();

	        if (rs.next()) {
	            // 조회된 글 정보를 Board 객체에 저장
	            board = new Board(
	                rs.getInt("num"),
	                rs.getString("writer"),
	                rs.getString("title"),
	                rs.getString("content"),
	                rs.getString("regtime"),
	                rs.getInt("hits")
	            );
	            
	            if(inc) {
	            	pstmt.executeUpdate("update board set hits = hits+1 where num="+num);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return board; // 조회된 Board 객체를 반환합니다.
	}
	public int delete(int num) {
		int result = 0;
		try ( 
		        PreparedStatement pstmt = conn.prepareStatement(
		        		"delete from board where num=" + num);
		    ) {
		        // 쿼리 실행
		        return pstmt.executeUpdate();
//		        return result;
		        
		    } catch(Exception e) {
		        e.printStackTrace();
		    }
		return result;
//		return 0;
	}
	    
	public int insert(Board board) {
		//now는 mysql  sysdate는 오라클
		//num을 안 쓴 것은, mysql 쿼리문참조
		//
		String bSql = "insert into board(writer, title, content, regtime, hits) values (?,?,?,now(),0)";
	    try ( 
	        PreparedStatement pstmt = conn.prepareStatement(bSql);            
	    ) {
	        // 현재 시간 얻기
//	        String curTime = LocalDate.now() + " " + 
//	                         LocalTime.now().toString().substring(0, 8);
	        
	        // 쿼리 실행
	    	pstmt.setString(1, board.getWriter());
	    	pstmt.setString(2, board.getTitle());
	    	pstmt.setString(3, board.getContent());
	        return pstmt.executeUpdate();
	    
	    } catch(Exception e) {
	        e.printStackTrace();
	    } 
		return 0;
	}
	
	public int update(Board board) {
        String bSql = "update board set writer=?, title=?, content=?, regtime=now() where num=?";
	    try ( 
	        PreparedStatement pstmt = conn.prepareStatement(bSql);            
	    ) {
	        // 현재 시간 얻기
//	        String curTime = LocalDate.now() + " " + 
//	                         LocalTime.now().toString().substring(0, 8);
	        
	        // 쿼리 실행
	    	pstmt.setString(1, board.getWriter());
	    	pstmt.setString(2, board.getTitle());
	    	pstmt.setString(3, board.getContent());
	    	pstmt.setInt(4, board.getNum());
	        return pstmt.executeUpdate();
	    
	    } catch(Exception e) {
	        e.printStackTrace();
	    } 
		return 0;
	}
	
	
//	public int delete(int num) {
//	    String sql = "delete from board where num=?";
//	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//	        pstmt.setInt(1, num);
//	        int rowsAffected = pstmt.executeUpdate();
//	        if (rowsAffected > 0) {
//	            System.out.println("게시글이 성공적으로 삭제되었습니다.");
//	        } else {
//	            System.out.println("삭제할 게시글을 찾을 수 없습니다.");
//	        }
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
//	    return 0;
//	}
	
//	
//	public Board selectOne(int num) {
//	    Board board = null; // Board 객체를 초기화합니다.
//	    String sql = "SELECT * FROM board WHERE num = ?";
//	    PreparedStatement pstmt;
//	    try {
//	        pstmt = conn.prepareStatement(sql);
//	        pstmt.setInt(1, num);
//	        ResultSet rs = pstmt.executeQuery();
//
//	        if (rs.next()) {
//	            // 조회된 글 정보를 Board 객체에 저장
//	            board = new Board(
//	                rs.getInt("num"),
//	                rs.getString("writer"),
//	                rs.getString("title"),
//	                rs.getString("content"),
//	                rs.getString("regtime"),
//	                rs.getInt("hits")
//	            );
//				// 조회수 증가를 위한 SQL 쿼리 실행
		//    pstmt = conn.prepareStatement("UPDATE board SET hits = hits + 1 WHERE num = ?");
		//    pstmt.setInt(1, num);
		//    pstmt.executeUpdate();
//	        }
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
//	    return board; // 조회된 Board 객체를 반환합니다.
//	}
//	
	
	//생각하던 부분
//	public static Board selectOne(int num,BoardDao) {
//		writer  = rs.getString("writer" );
//        title   = rs.getString("title"  );
//        content = rs.getString("content");
//        regtime = rs.getString("regtime");
//        hits    = rs.getInt   ("hits"   );
//
//        // 글 제목과 내용이 웹 페이지에 올바르게 출력되도록 
//        // 공백과 줄 바꿈 처리
//        title   = title.replace  (" ", "&nbsp;");
//        content = content.replace(" ", "&nbsp;").replace("\n", "<br>");
//		
//		
//		String memberId = (String)session.getAttribute("MEMBERID");
//		if (memberId == null) {
//			response.sendRedirect("sessionLoginForm.jsp");
//		}
//		BoardDao dao = BoardDao.getInstance();
//		List<Board> list = dao.selectList();
//	
//		pstmt.executeUpdate(
//             "update board set hits=hits+1 where num=" + num);
//	}
}



//
//package dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//import dto.Board;
//
//public class BoardDao {
//	private static Connection conn;
//	private static BoardDao dao = new BoardDao();
//	private BoardDao() {} // 생성자
//	public static BoardDao getInstance() {
////		conn = getConnection(); 
//		BoardDao.getConnection();
//		return dao;
//	}
//	
//	private static void getConnection() {
//		Connection conn = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(
//	        		"jdbc:mysql://localhost:3306/project1", "root", "mysql");
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
////		return conn;   이후에 Connection 삭제 void추가 
//	}
//	
//	public ArrayList<Board> selectList() {
//		ArrayList<Board> list = new ArrayList<Board>();
//		String sql = "select * from board order by num desc";
//		PreparedStatement pstmt;
//		try {
//			pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			
//			while (rs.next()) {
//				Board board = new Board(rs.getInt("num"), rs.getString("writer"), 
//						rs.getString("title"), rs.getString("content"),
//						rs.getString("regtime"), 0);
//				list.add(board);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		
//		return list;
//		
//	}
//	
//}