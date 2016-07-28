package kr.ac.sungkyul.bookmall.vo;

public class BookVo {
	private Long no;
	private String title;
	private Integer rate;
	/*
	 * private Long authorNo;
	 * private AuthorVo author; : 쿼리 받아올 객체로 생성이 안 되기 때문에 사용 x
	 */
	private Integer authorNo;

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

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	
	public Integer getAuthorNo() {
		return authorNo;
	}

	public void setAuthorNo(Integer authorNo) {
		this.authorNo = authorNo;
	}

	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", rate=" + rate + ", authorNo=" + authorNo + "]";
	}
}
