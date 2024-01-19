package anonymous;

class AnyClass {
	void mmm() {};
}

public class Ex {
	public static void main(String[] args) {
//		AnyClass ac = new AnyClass() {}  아래코드와 같은 코드가 아님
//		AnyClass ac = new AnyClass() {}; 위코드와 같은 코드가 아님
		AnyClass ac = new AnyClass() { //익명의 자식객체

			@Override
			void mmm() {
				// TODO Auto-generated method stub
				super.mmm();
			}
			
		};
	}
}
