package sec02.exam04;

public class Anonymous {
	int field;
	void method(int arg1,int arg2) {
		int var1 = 0;
		int var2 = 0;
//		arg1 = 20;
//		arg2 = 20;   //오류. 익명객체로 생성된 
		field = 10;
		
		Calculatable calc = new Calculatable() {
			//이 부분의 정상실행을 위해서
			@Override
			public int sum() {
				int result = field + arg1 +arg2 + var1 +var2;
				
				return result;
			}
		};
//		calc.sum();
//		int x = calc.sum();
		System.out.println(calc.sum());
	}

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method(0, 0);
	}

}

