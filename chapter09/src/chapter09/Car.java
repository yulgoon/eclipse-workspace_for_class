package chapter09;

public abstract class Car {

	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnoff();

	public void carWash() {
		System.out.println("������ �մϴ�.");
	}

	public final void run() {
		start();
		drive();
		stop();
		turnoff();
		carWash();
	}
}