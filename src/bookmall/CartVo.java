package bookmall;

public class CartVo {
	private Long memberNo;		// 회원 번호
	private String memberName;	// 회원명
	private Long bookNo; 		// 도서 번호
	private String bookName; 	// 도서명
	private Long bookNumber; 	// 도서 갯수
	private Long cartPrice; 	// 장바구니 금액

	public Long getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Long getBookNo() {
		return bookNo;
	}

	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Long getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(Long bookNumber) {
		this.bookNumber = bookNumber;
	}

	public Long getCartPrice() {
		return cartPrice;
	}

	public void setCartPrice(Long cartPrice) {
		this.cartPrice = cartPrice;
	}

	@Override
	public String toString() {
		return "CartVo [memberName=" + memberName + ", bookName=" + bookName + ", bookNumber=" + bookNumber
				+ ", cartPrice=" + cartPrice + "]";
	}
}