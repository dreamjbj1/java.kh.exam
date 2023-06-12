package collection;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getmemberId() {
		return memberId;
	}
	
	public void getmemberId(int memberID) {
		this.memberId = memberId;
	}
	public String getmemberName() {
		return memberName;
	}
	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
	}
	
	
	
	
}
