package inheritance;

public class Point {
	
	protected int x,y;	//��ǥ�� ��Ÿ���� ����
	/*
	 * protected : default�� �⺻���� ���� ���Ѱ� ����� ���������� �ٸ� ��Ű���� Ŭ�������� ����ϸ� ���� ���
	 */
	
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
		
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}