package bookmall;

import java.sql.*;
import java.util.*;

public class MemberDao {
	public int membership(MemberVo vo) {
		/* 회원 가입 */

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
			String sql = "insert into members values(seq_members.nextval, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			// 4. 바인딩 준비
			pstmt.setString(1, vo.getMemberName());
			pstmt.setString(2, vo.getMemberPhone());
			pstmt.setString(3, vo.getMemberEmail());
			pstmt.setString(4, vo.getMemberPassword());

			// 5. 쿼리 실행
			count = pstmt.executeUpdate();

			System.out.println(count + "명의 회원정보가 입력되었습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : " + e);
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
				System.out.println("SQL Error : " + e);
			}
		}
		return count;
	}

	public int membershipDelete(Long no) {
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
			String sql = "delete from members where m_num = ?";
			pstmt = conn.prepareStatement(sql);

			// 4. 바인딩
			pstmt.setLong(1, no);

			// 5. sql 실행
			count = pstmt.executeUpdate();
			System.out.println(count + "명의 회원정보가 삭제되었습니다.");

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
				System.out.println("SQL Error : " + e);
			}
		}
		return count;
	}

	public int membershipUpdate(MemberVo vo) {
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
			String sql = "update members set m_name = ?, m_phone = ?, m_email = ?, m_pw = ?";
			pstmt = conn.prepareStatement(sql);

			// 4. 바인딩
			pstmt.setString(1, vo.getMemberName());
			pstmt.setString(2, vo.getMemberPhone());
			pstmt.setString(3, vo.getMemberEmail());
			pstmt.setString(4, vo.getMemberPassword());

			// 5. sql 실행
			count = pstmt.executeUpdate();
			System.out.println(count + "명의 회원정보가 수정되었습니다.");

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
				System.out.println("SQL Error : " + e);
			}
		}
		return count;
	}

	public List<MemberVo> getList() {
		List<MemberVo> list = new ArrayList<MemberVo>();

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
			String sql = "select m_num, m_name, m_phone, m_email, m_pw from members";
			rs = stmt.executeQuery(sql);

			// 5. 결과 처리
			while (rs.next()) {
				Long memberNo = rs.getLong(1);
				String memberName = rs.getString(2);
				String memberPhone = rs.getString(3);
				String memberEmail = rs.getString(4);
				String memberPassword = rs.getString(5);

				MemberVo vo = new MemberVo();
				vo.setMemberNo(memberNo);
				vo.setMemberName(memberName);
				vo.setMemberPhone(memberPhone);
				vo.setMemberEmail(memberEmail);
				vo.setMemberPassword(memberPassword);

				list.add(vo);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : " + e);
		} catch (SQLException e) {
			System.out.println("SQL Error : " + e);
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