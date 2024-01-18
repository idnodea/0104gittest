package sec05.exam02;

public class StudentService {
	
//	private Student[] stuArr = new Student[3];
	 Student student = new Student();
	
    private static StudentService studentService = new StudentService();

    private StudentService() {
        // 생성자를 private으로 선언하여 외부에서의 인스턴스 생성을 막음
    }

    public static StudentService getInstance() {
//    	public static StudentService gaas() {    //꼭 겟인스턴스는 아니어도 됨
        // 코딩부분
        return studentService;
    }
}