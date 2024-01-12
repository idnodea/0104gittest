//변수 사용
package sec01;

public class VariableEx {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.err.println(hour+"시간"+minute+"분");
		int totalMinute = (hour*60) +minute;
		System.out.println("총"+totalMinute+"분");
	}

}
