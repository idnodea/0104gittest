package sec02.exam02;

public class Anonymous {
    // Person 타입의 필드, 익명 클래스로 초기화
    Person field = new Person() {
        // 익명 클래스에서 work 메서드를 재정의
        void work() {
            System.out.println("출근");
        }

        @Override
        void wake() {
//        	super.wake();
            System.out.println("6시 기상");
            work();
        }
    };

    // 구현이 주어지지 않은 빈 메서드
    void method1() {
        // 구현 내용이 없음
    	Person localVar = new Person() {
    		void walk() {
    			System.out.println("산책");
    		}

			@Override
			void wake() {
//				super.wake();
			System.out.println("7시 기상");
			walk();
			}
    	};
    	localVar.wake();
    }

    // Person 타입의 매개변수를 받는 메서드, 구현이 주어지지 않았음
    void method2(Person person) {
        // 구현 내용이 없음
    	person.wake();
    }
}