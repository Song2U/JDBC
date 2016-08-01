package bookmall;

import java.util.List;

public class MemberDaoTest {

	public static void main(String[] args) {
		//membership();
		memberGetList();
		/*
		 * membershipDelete(); memberGetList(); membershipUpdate();
		 * memberGetList();
		 */
	}

	public static void membership() {
		MemberDao dao = new MemberDao();

		MemberVo vo = new MemberVo();
		vo.setMemberName("양송이");
		vo.setMemberPhone("010-1234-5678");
		vo.setMemberEmail("ysi1246@sungkyul.ac.kr");
		vo.setMemberPassword("abcd1234");
		dao.membership(vo);

		vo = new MemberVo();
		vo.setMemberName("암바사");
		vo.setMemberPhone("1399");
		vo.setMemberEmail("cocacola@sungkyul.ac.kr");
		vo.setMemberPassword("1234abcd");
		dao.membership(vo);

		vo = new MemberVo();
		vo.setMemberName("순수");
		vo.setMemberPhone("080-024-5999");
		vo.setMemberEmail("natural0@sungkyul.ac.kr");
		vo.setMemberPassword("haetae500");
		dao.membership(vo);
	}

	public static void membershipDelete() {
		MemberDao dao = new MemberDao();
	}

	public static void memberGetList() {
		MemberDao dao = new MemberDao();
		List<MemberVo> list = dao.getList();

		for (MemberVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void membershipUpdate() {
		MemberDao dao = new MemberDao();
		MemberVo vo = new MemberVo();

		vo.setMemberNo(1L);
		vo.setMemberName("양송이버섯");
		vo.setMemberPhone("010-9876-5432");
		vo.setMemberEmail("ysi1246@naver.com");
		vo.setMemberPassword("qwerty1234");
	}
}