//0126 2교시

package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id){
		this.id = id;
	}
	//소스-투스트링
	@Override
	public String toString() {
//		return "member 객체["+id+"]";
		return "Member 객체["+id+"]";
	}

	//소스-오버라이드- 오브젝트에서 이콜즈
	@Override
	public boolean equals(Object obj) {//매개변수 다형성
//	public boolean equals(Member obj) {
		if(obj instanceof Member) {   //객체생성가능성여부
									//Member로 객체생성?
			Member member = (Member) obj; //강제 형변환을 왜?
//			if(id.equals(member.id)) { //문자열비교하려고
			if(id.equalsIgnoreCase(member.id)) {
				//equalsIgnoreCase 대문자로도 가능하게
				return true;
			}
		}return false;
	}
	//소스-오버라이드-오브젝트-해쉬코드
	@Override
	public int hashCode() {
//		return id.hashCode();
		return id.toLowerCase().hashCode();
	}
}
