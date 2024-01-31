package sec01.exam22;

import java.util.Objects;

public class Student {

	
		private String studentNum;
		
		public Student(String studentNum) {
			this.studentNum = studentNum;
		}
		
		public String gettudentNum() {
			return studentNum;
		}

		
		//소스-해쉬코드
		@Override
		public int hashCode() {
			return Objects.hash(studentNum);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(studentNum, other.studentNum);
		}

		//여기서 코드를 작성
		
}
