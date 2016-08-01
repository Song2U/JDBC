package bookmall;

import java.sql.*;
import java.util.*;

public class BookDao {
	public int insertBook(BookVo vo) {
		int count = 0;

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "skudb", "skudb");

			String sql = "insert into book values(seq_book.nextval, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getTitle());
			pstmt.setLong(2, vo.getAuthorNo());
			pstmt.setLong(3, vo.getCategoryNo());
			pstmt.setLong(4, vo.getPrice());
			
			count = pstmt.executeUpdate();
			
			System.out.println(count + "개의 도서정보가 입력되었습니다.");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : " + e);
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e);
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("SQL Error : " + e);
			}
		}
		return count;
	}
	public List<BookVo> getList(){
		List<BookVo> list = new ArrayList<BookVo>();
		return list;
	}
}
