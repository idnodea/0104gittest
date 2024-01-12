package sec05;
	//2024012 혼자공 p205 3교시
import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today =null;    
		
		Calendar cal = Calendar.getInstance();
//		int year =cal.get(Calendar.DAY_OF_YEAR)+1;
//		System.out.println(year);
		int week =cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		int month =cal.get(Calendar.MONTH)+1;
		System.out.println(month+"월");
		
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.TUESDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
			
		}
		
		System.out.println("오늘 요일:"+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 하자");
		}else {
			System.out.println("열심히 자바 공부합니다");
		}
		
	}
}

