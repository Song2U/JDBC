package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.BookDao;
import kr.ac.sungkyul.bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		testBookDaoInsert();
		testBookDaoGetList();
	}

	public static void testBookDaoGetList() {
		BookDao dao = new BookDao();
		List<BookVo> list = dao.getList();

		for (BookVo vo : list) {
			System.out.println(vo);
		}

	}

	public static void testBookDaoInsert() {
		BookVo vo = new BookVo();

		vo.setNo((long) 1);
		vo.setTitle("책책");
		vo.setRate(5);
		vo.setAuthorNo(2);

		BookDao dao = new BookDao();
		dao.insert(vo);
	}

}