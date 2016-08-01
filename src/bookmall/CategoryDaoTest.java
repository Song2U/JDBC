package bookmall;

import java.util.List;

public class CategoryDaoTest {

	public static void main(String[] args) {
	//	createCategory();
		categoryGetList();
	}
	public static void createCategory(){
		CategoryDao dao = new CategoryDao();
		
		CategoryVo vo = new CategoryVo();
		vo.setCategoryName("소설");
		dao.createCategory(vo);
		
		vo = new CategoryVo();
		vo.setCategoryName("에세이");
		dao.createCategory(vo);
	}
	
	public static void categoryGetList(){
		CategoryDao dao = new CategoryDao();
		List<CategoryVo> list = dao.getList();
		
		for(CategoryVo vo : list){
			System.out.println(vo);
		}
	}
}