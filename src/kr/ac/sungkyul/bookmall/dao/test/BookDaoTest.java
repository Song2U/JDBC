package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.test.BookDao;
import kr.ac.sungkyul.bookmall.vo.BookVo;


public class BookDaoTest {

	public static void main(String[] args) {
		testBookDaoInsert();
		testBookDaoGetList();
	}

	public static void testBookDaoDeleteAll(){
		BookDao dao = new BookDao();
		BookVo vo = new BookVo();
		
		int count = dao.delete();
		System.out.println("삭제된 row 수 : " + count);
	}
	
	public static void testBookDaoUpdate(){
		BookDao dao = new BookDao();
		BookVo vo = new BookVo();
		
		vo.setNo(1L);
		vo.setTitle("ㅋㅋ");
		vo.setRate(4);
		vo.setAuthorNo(2L);
		
		dao.update(vo);
	}
	
	public static void testBookDaoDelete(){
		BookDao dao = new BookDao();
		int count = dao.delete(3L);
		System.out.println("삭제된 row 수 : "+  count);
		
	}
	
	public static void testBookDaoGetList(){
		BookDao dao = new BookDao();
		List<BookVo> list = dao.getList();
		
		for( BookVo vo : list ) {
			System.out.println( vo );
		}		
	}

	public static void testBookDaoInsert(){
		BookDao dao = new BookDao();

		BookVo vo = new BookVo();
		vo.setTitle( "트와일라잇" );
		vo.setRate( 1 );
		vo.setStatus(1);
		vo.setAuthorNo(1L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle( "뉴문" );
		vo.setRate( 1 );
		vo.setStatus(1);
		vo.setAuthorNo(1L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle( "이클립스" );
		vo.setRate( 1 );
		vo.setStatus(1);
		vo.setAuthorNo(1L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle( "브레이킹던" );
		vo.setRate( 1 );
		vo.setStatus(1);
		vo.setAuthorNo(1L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle( "아리랑" );
		vo.setRate( 1 );
		vo.setStatus(1);
		vo.setAuthorNo(2L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle( "젊은 그들" );
		vo.setRate( 1 );
		vo.setStatus(0);
		vo.setAuthorNo(3L);
		dao.insert(vo);		
		
		vo = new BookVo();
		vo.setTitle( "아프니까 청춘이다" );
		vo.setRate( 4 );
		vo.setStatus(1);
		vo.setAuthorNo(1L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle( "귀천" );
		vo.setRate( 1 );
		vo.setStatus(1);
		vo.setAuthorNo(6L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle( "태백산맥" );
		vo.setRate( 1 );
		vo.setStatus(1);
		vo.setAuthorNo(2L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle( "풀하우스" );
		vo.setRate( 1 );
		vo.setStatus(1);
		vo.setAuthorNo(5L);
		dao.insert(vo);
	}
}