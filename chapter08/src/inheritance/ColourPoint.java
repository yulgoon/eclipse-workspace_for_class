package inheritance;

public class ColourPoint extends Point	{
	/*
	 * extends (Ŭ������) <- (Ŭ������)�� Ŭ������ ��� �ްڴٴ� �����
	 * ColourPoint : �ڽ�Ŭ���� / Point :
	 * �θ�Ŭ����
	 */

	private String colour; // ��(x,y)�� ���� ǥ���ϴ� ��ǥ���� �Է¸������� ����

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void showColourPoint() {
		System.out.print(colour + " ");
		showPoint(); // ��� ���� Point Ŭ������ �޼ҵ� ȣ��
	}

	public static void main(String[] args) {
		Point p = new Point();
		p.x = 1;
		p.y = 2;

	}
}