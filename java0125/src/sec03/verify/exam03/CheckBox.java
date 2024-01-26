package sec03.verify.exam03;

// CheckBox 클래스 정의
public class CheckBox {

    // OnSelectListener 인터페이스를 가리키는 멤버 변수
    OnSelectListener listener;

    // 리스너를 설정하는 메서드
    void setOnSelectListener(OnSelectListener listener) {
        // 외부에서 받은 리스너를 클래스의 멤버 변수에 할당
        this.listener = listener;
    }

    // 선택 이벤트를 발생시키는 메서드
    void select() {
        // 설정된 리스너의 onSelect 메서드를 호출
        listener.onSelect();
    }

    // 내부 인터페이스 정의
    interface OnSelectListener {
        void onSelect();
    }
}
    
//CheckBox 클래스:
//
//OnSelectListener 인터페이스를 멤버로 가짐.
//setOnSelectListener 메서드: 외부에서 리스너를 설정하기 위한 메서드. 외부에서 받은 리스너를 내부의 listener 멤버 변수에 할당.
//select 메서드: 선택 이벤트를 발생시키는 메서드. 설정된 리스너의 onSelect 메서드를 호출.
//OnSelectListener 인터페이스:
//
//CheckBox 클래스 내에서 정의된 내부 인터페이스.
//onSelect 메서드를 정의하며, 이 메서드는 선택 이벤트가 발생했을 때 호출될 내용을 구현하는 역할을 합니다.
//이 코드는 리스너 패턴을 구현한 간단한 예제입니다. CheckBox 클래스는 선택 이벤트가 발생했을 때 등록된 리스너의 onSelect 메서드를 호출하여 특정 동작을 수행하도록 설계되어 있습니다. 이런 구조는 GUI 프로그래밍에서 버튼 클릭 등의 이벤트 처리에 자주 활용됩니다.