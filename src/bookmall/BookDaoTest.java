package bookmall;

import java.util.List;

public class BookDaoTest {

	public static void main(String[] args) {
		bookInsert();
	}
	public static void bookInsert(){
		BookDao dao = new BookDao();
		
		BookVo vo = new BookVo();
		vo.setTitle("트와일라잇");
		vo.setAuthorNo(1L);
		vo.setCategoryNo(1L);
		vo.setPrice(13000L);
		dao.insertBook(vo);
		
		vo = new BookVo();
		vo.setTitle("뉴문");
		vo.setAuthorNo(1L);
		vo.setCategoryNo(1L);
		vo.setPrice(13000L);
		dao.insertBook(vo);
		
		vo = new BookVo();
		vo.setTitle("이클립스");
		vo.setAuthorNo(1L);
		vo.setCategoryNo(1L);
		vo.setPrice(14000L);
		dao.insertBook(vo);
		
		vo = new BookVo();
		vo.setTitle("브레이킹던");
		vo.setAuthorNo(1L);
		vo.setCategoryNo(1L);
		vo.setPrice(16000L);
		dao.insertBook(vo);
		
		vo = new BookVo();
		vo.setTitle("아리랑");
		vo.setAuthorNo(2L);
		vo.setCategoryNo(1L);
		vo.setPrice(13800L);
		dao.insertBook(vo);
		
		vo = new BookVo();
		vo.setTitle("젊은 그들");
		vo.setAuthorNo(3L);
		vo.setCategoryNo(1L);
		vo.setPrice(15000L);
		dao.insertBook(vo);
		
		vo = new BookVo();
		vo.setTitle("아프니까 청춘이다");
		vo.setAuthorNo(4L);
		vo.setCategoryNo(1L);
		vo.setPrice(14000L);
		dao.insertBook(vo);
		
		vo = new BookVo();
		vo.setTitle("귀천");
		vo.setAuthorNo(5L);
		vo.setCategoryNo(1L);
		vo.setPrice(12000L);
		dao.insertBook(vo);
		
		vo = new BookVo();
		vo.setTitle("태백산맥");
		vo.setAuthorNo(2L);
		vo.setCategoryNo(1L);
		vo.setPrice(13800L);
		dao.insertBook(vo);
		
		vo = new BookVo();
		vo.setTitle("풀하우스");
		vo.setAuthorNo(6L);
		vo.setCategoryNo(1L);
		vo.setPrice(13000L);
		dao.insertBook(vo);
	}
}