package bookmall;

public class OrderVo {
	private Long orderNo; 		 // 주문 번호
	private Long memberNo; 		 // 회원 번호
	private String memberName;	 // 회원명
	private Long orderPrice; 	 // 주문 금액
	private String orderAddress; // 주문 주소

	public Long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}

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

	public Long getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Long orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	@Override
	public String toString() {
		return "OrderVo [orderNo=" + orderNo + ", memberName=" + memberName + ", orderPrice=" + orderPrice
				+ ", orderAddress=" + orderAddress + "]";
	}
}
