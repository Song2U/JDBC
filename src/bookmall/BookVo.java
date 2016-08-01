package bookmall;

public class BookVo {
	private Long no; 			// 도서 번호
	private String title; 		// 도서명
	private Long authorNo; 	// 작가 번호
	private String author; 		// 작가명
	private Long categoryNo; // 카테고리 번호
	private String category;	// 카테고리명
	private Long price; 		// 도서 가격

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public Long getAuthorNo() {
		return authorNo;
	}

	public void setAuthorNo(Long authorNo) {
		this.authorNo = authorNo;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", author=" + author + ", category=" + category + ", price="
				+ price + "]";
	}
}