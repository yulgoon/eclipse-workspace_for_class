package chapter05;

public class MyDateTest {
	
	public static void main(String[] args) {
		MyDate today = new MyDate(8,7,2021);
		today.showMyDateInfo();
		System.out.println(today.isValid);
	}

}
