package test;

public class Q14_01 {

	public static void main(String[] arge) {

		int total = 0;

		int array[] = new int[10];

		array[0] = (int) (Math.random() * 10 + 1);
		array[1] = (int) (Math.random() * 10 + 1);
		array[2] = (int) (Math.random() * 10 + 1);
		array[3] = (int) (Math.random() * 10 + 1);
		array[4] = (int) (Math.random() * 10 + 1);
		array[5] = (int) (Math.random() * 10 + 1);
		array[6] = (int) (Math.random() * 10 + 1);
		array[7] = (int) (Math.random() * 10 + 1);
		array[8] = (int) (Math.random() * 10 + 1);
		array[9] = (int) (Math.random() * 10 + 1);

		System.out.print("임의의 정수들 : ");
		System.out.print(array[0] + " ");
		System.out.print(array[1] + " ");
		System.out.print(array[2] + " ");
		System.out.print(array[3] + " ");
		System.out.print(array[4] + " ");
		System.out.print(array[5] + " ");
		System.out.print(array[6] + " ");
		System.out.print(array[7] + " ");
		System.out.print(array[8] + " ");
		System.out.println(array[9]);

		for (int i = 0; i < array.length; i++) {

			total += array[i];
		}
		System.out.println();
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + ((double) total / array.length));
	}
}
