package chapter09_2;

public class CarTest extends Car {

	public static void main(String[] args) {
		String sonata = "Sonata ";
		Car son = new Car();
		System.out.print(sonata);	son.start();
		System.out.print(sonata);	son.drive();
		System.out.print(sonata);	son.stop();
		System.out.print(sonata);	son.turnoff();
		son.carWash();
		System.out.println("====================");
		
		String grandeur = "Grandeur ";
		Car gra = new Car();
		System.out.print(grandeur);	gra.start();
		System.out.print(grandeur);	gra.drive();
		System.out.print(grandeur);	gra.stop();
		System.out.print(grandeur);	gra.turnoff();
		gra.carWash();
		System.out.println("====================");
		
		String avante = "Avante ";
		Car ava = new Car();
		System.out.print(avante);	ava.start();
		System.out.print(avante);	ava.drive();
		System.out.print(avante);	ava.stop();
		System.out.print(avante);	ava.turnoff();
		ava.carWash();
		System.out.println("====================");
		
		String genesis = "Genesis ";
		Car gen = new Car();
		System.out.print(genesis);	gen.start();
		System.out.print(genesis);	gen.drive();
		System.out.print(genesis);	gen.stop();
		System.out.print(genesis);	gen.turnoff();
		gen.carWash();
		System.out.println("====================");
		
	}
}
