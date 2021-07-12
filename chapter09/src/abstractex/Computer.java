package abstractex;

public abstract class Computer { // class에 abstract 선언 -> 추상 메소드를 포함하는 template
	/*
	 * 추상 메소드 : 실행(구현)부({})가 없고 선언부만 정의한 method -> 선언만 해두고 구현은 상속을 통해 하위 클래스에서 함
	 * public void display(); public void typing();
	 * public int add(int a, int b); public int add(int a, int b) {} {} 부분(실행부)에
	 * return 부분이 담겨있지 않아서 error
	 * 
	 * class와 method 모두 반드시 abstract 정의가 되어야 함
	 */

	public abstract void display(); // 추상 메소드

	abstract public void typing(); // 추상 메소드

	public void add(int a, int b) {
	} // 일반 메소드

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
