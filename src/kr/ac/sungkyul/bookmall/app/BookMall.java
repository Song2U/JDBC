package kr.ac.sungkyul.bookmall.app;

import java.util.List;
import java.util.Scanner;

import kr.ac.sungkyul.bookmall.dao.BookDao;
import kr.ac.sungkyul.hr.vo.EmployeeVo;

public class BookMall {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("대여하고 싶은 책의 번호를 입력하세요. : ");
		int num = key.nextInt();
		BookDao dao = new BookDao();
		List<EmployeeVo> list = dao.updateStatus(num, 1);
		System.out.println("도서정보 출력");
		
		displayBookInfo(books);
		
	}
	public static void displayBookInfo(){
		
	}

}
