package kr.ac.sungkyul.bookmall.dao;

import java.sql.*;
import java.util.*;

import kr.ac.sungkyul.bookmall.vo.AuthorVo;

public class AuthorDao {
	public int delete() {
		/* 전체 삭제 */
		return 0;
	}

	public int update(AuthorVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "skudb", "skudb");

			// 3. Statement 준비
			String sql = "update author set name = ?, description = ?, where no = ?";
			pstmt = conn.prepareStatement(sql);

			// 4. 바인딩
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getDescription());
			pstmt.setLong(3, vo.getNo());

			// 5. sql 실행
			count = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다. : " + e);
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;

	}

	public int delete(Long no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "skudb", "skudb");

			// 3. Statement 준비
			String sql = "delete from author where no = ?";
			pstmt = conn.prepareStatement(sql);

			// 4. 바인딩
			pstmt.setLong(1, no);

			// 5. sql 실행
			count = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다. : " + e);
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}

	public int insert(AuthorVo vo) {
		int count = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 연결 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "skudb", "skudb");

			// 3. statement 준비
			String sql = "insert into author values(seq_Author.nextval, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			// 4. 바인딩 준비
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getDescription());

			// 5. 쿼리 실행
			count = pstmt.executeUpdate();

			System.out.println(count + "개의 row가 입력되었습니다.");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 :" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				// 6. 자원정리
				if (pstmt != null) {
					pstmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
		return count;
	}

	public List<AuthorVo> getList() {
		List<AuthorVo> list = new ArrayList<AuthorVo>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 연결 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "skudb", "skudb");

			// 3. statement 생성
			stmt = conn.createStatement();

			// 4. SQL문 실행
			String sql = "select no," + "       name," + "       description" + "  from author";
			rs = stmt.executeQuery(sql);

			// 5. 결과 처리
			while (rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String description = rs.getString(3);

				AuthorVo vo = new AuthorVo();
				vo.setNo(no);
				vo.setName(name);
				vo.setDescription(description);

				list.add(vo);

			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 :" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				// 6. 자원정리
				if (rs != null) {
					rs.close();
				}

				if (stmt != null) {
					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}

		return list;
	}
}
