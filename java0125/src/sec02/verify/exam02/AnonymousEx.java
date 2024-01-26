package sec02.verify.exam02;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anony= new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}
