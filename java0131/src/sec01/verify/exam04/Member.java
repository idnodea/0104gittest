package sec01.verify.exam04;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		
		//여기서 코드작성
		
		
	}
	//투스트링을 불러온 후
//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", name=" + name + "]";
//	}
//	
	//투스트링을 수정함
	@Override
    public String toString() {
        return id + ":" + name;
    }
	
}
