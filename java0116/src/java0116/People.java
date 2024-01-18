//0116 3교시
package java0116;

import java.util.Objects;

public class People {
	String name;
	
	
	public People() {}   //쓰는 순간, super없이도 오류 뜨지 않음
	
	public People(String name) {
		this.name =name;
	}
	
	void method1() {}

	
	//소스-제너레이트-투스트링
	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}

	//소스-제너레이트-해쉬코드이콜즈
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(name, other.name);
	}
	
}
