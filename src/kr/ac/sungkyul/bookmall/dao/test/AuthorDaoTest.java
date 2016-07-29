package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.vo.AuthorVo;
import kr.ac.sungkyul.bookmall.vo.BookVo;

public class AuthorDaoTest {

	public static void main(String[] args) {
	//	testAuthorDaoInsert();
		/*testAuthorDaoGetList();
		testAuthorDaoDelete();
		testAuthorDaoGetList();
		testAuthorDaoUpdate();
		testAuthorDaoGetList();*/
		testAuthorDaoDeleteAll();
		testAuthorDaoGetList();
	}

	public static void testAuthorDaoDeleteAll(){
		AuthorDao dao = new AuthorDao();
		AuthorVo vo = new AuthorVo();
		
		int count = dao.delete();
		System.out.println("삭제된 row 수 : " + count);
	}
	
	public static void testAuthorDaoUpdate(){
		AuthorDao dao = new AuthorDao();
		AuthorVo vo = new AuthorVo();
		
		vo.setNo(1L);
		vo.setName("플라톤 2");
		vo.setDescription("그리스 철학자");
		
		dao.update(vo);
	}
	
	public static void testAuthorDaoDelete(){
		AuthorDao dao = new AuthorDao();
		int count = dao.delete(3L);
		System.out.println("삭제된 row 수 : "+  count);
		
	}
	public static void testAuthorDaoGetList() {
		AuthorDao dao = new AuthorDao();
		List<AuthorVo> list = dao.getList();

		for (AuthorVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testAuthorDaoInsert() {
		AuthorDao dao = new AuthorDao();
		AuthorVo vo = new AuthorVo();

		vo.setName("플라톤");
		vo.setDescription("..");
		dao.insert(vo);

		vo.setName("공자");
		vo.setDescription("..");
		dao.insert(vo);

		vo.setName("박경리");
		vo.setDescription("토지 저자");
		dao.insert(vo);
	}
}