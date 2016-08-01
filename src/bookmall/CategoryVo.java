package bookmall;

public class CategoryVo {
	private Long categoryNo; 	 // 카테고리 번호
	private String categoryName; // 카테고리명

	public Long getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "번호 : " + categoryNo + ",\t카테고리명 : " + categoryName;
	}
}