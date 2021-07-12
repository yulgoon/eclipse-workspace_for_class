package gamelevel;

public abstract class PlayerLevel {
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

	final public void gotest(int a) {
		System.out.println("final�� �޼ҵ忡 �Ҵ�� ��� override �Ұ�");
	}
	
	public void gotest2() {
		System.out.println("�޼ҵ忡 final�� ���� ��� override ����");
	}
}