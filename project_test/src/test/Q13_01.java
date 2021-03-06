package test;

import java.util.Scanner;

public class Q13_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("금액을 입력하시오. >>"); // 금액을 입력하시오 >> 65123

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		// index 0~7(8개)

		int cash = scanner.nextInt();

		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d 원짜리: %d개 \n", unit[i], cash / unit[i]);
			cash = cash - (cash / unit[i]) * unit[i];
		}

		scanner.close();

	}
}
