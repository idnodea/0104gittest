package sec05.exam01;

public class Animal {

		private String name;   //private 접근제한자
		private int age;   
		
		//우클-소스-게터섹터
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		

}
