package chapter05;

public class Calendar {
	int day;
	int month;
	int year;
	
	public void showDateInfo() {
		System.out.println(day + "/" + month + "/" + year);	
	}

	public void setDate(int day, int month, int year) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("날짜입력 오류입니다.");
			} else {
				this.day = day;
				this.month = month;
				this.year = year;
			}
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				System.out.println("날짜입력 오류입니다.");
			} else {
				this.day = day;
				this.month = month;
				this.year = year;
			}
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				System.out.println("날짜입력 오류입니다.");
			} else {
				this.day = day;
				this.month = month;
				this.year = year;
			}
		}
	}
}
