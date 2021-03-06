package inheritance;

public class Point {
	
	protected int x,y;	//좌표를 나타내는 변수
	/*
	 * protected : default의 기본적인 접근 제한과 기능이 동일하지만 다른 패키지의 클래스에서 상속하면 접근 허용
	 */
	
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
		
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}
