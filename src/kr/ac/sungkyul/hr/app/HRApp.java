package kr.ac.sungkyul.hr.app;

import java.util.List;
import java.util.Scanner;

import kr.ac.sungkyul.hr.dao.EmployeeDao;
import kr.ac.sungkyul.hr.vo.EmployeeVo;

public class HRApp {

	public static void main(String[] args) {
		searchByName();
	}
	public static void searchByName(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력  >> ");
		String name = scanner.nextLine();

		System.out.println("============================");
		
		EmployeeDao dao = new EmployeeDao();
		List<EmployeeVo> list = dao.getList(name);
		for(EmployeeVo vo : list){
			System.out.println(vo);
		}
		scanner.close();
	}
}