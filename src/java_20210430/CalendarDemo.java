package java_20210430;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기 1. 1년 1월 1일은 월요일 2. 1년은 365일 이고, 윤년은 366일 - 2월 29일 3. 윤년은 4년마다 발생하고 그
		 * 중에서 100배수는 제외하고 400의 배수는 제외하지 않는다. 4. 2021년 4월 30일은 무슨 요일 일까요?' 힌트) 2020년까지 총
		 * 일수, 1-3월까지 총 일수, 30을 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일, 3이면 수요일, 4이면 목요일, 5이면
		 * 금요일...
		 */

		int year = 2021;
		int month = 4;
		int day = 30;

		//int sum = 365 * 2020 + (505 - 20 + 5) + 31 + 28 + 31 + 30;
		
		//2020년까지 총 일수
		int totalCount = 365 * (year-1) + 
				(year-1)/4 - //2020년까지 윤년 
				(year-1)/100 + //100의 배수 제외
				(year-1)/400;  //400의 배수 포함
		
		//2021년도의 1월, 2월, 3월의 합을 구한다.
		//totalCount = totalCount + 31+ 28+31;
		totalCount += 31 + 28 + 31;
		
		//2021년도 4월의 일수를 더한다.
		totalCount += day; 
		
		
		int dayOfWeek = totalCount % 7;
		String message = "";

		if (dayOfWeek == 1) {
			message = "월요일";
		} else if (dayOfWeek == 2) {
			message = "화요일";
		} else if (dayOfWeek == 3) {
			message = "수요일";
		} else if (dayOfWeek == 4) {
			message = "목요일";
		} else if (dayOfWeek == 5) {
			message = "금요일";
		} else if (dayOfWeek == 6) {
			message = "토요일";
		} else {
			message = "일요일";
		}
		System.out.printf("%d년 %d월 %d일은 %s 입니다.", year, month, day, message);		
	}

}

