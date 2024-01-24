package page416;

public class Outter {
	static String str = "static-str";
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(Outter.str); //누구? "static-str"
			System.out.println(this.field); //누구?Nested-field
			System.out.println(field); //누구? Outter-field

			System.out.println(Outter.this.field);  //누구? "Outter-field"
		} 
	}
}
