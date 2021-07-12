package test;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str[] = { "가위", "바위", "보" };
		int n;
		String userSelect, comSelect;

		System.out.println("컴퓨터와 가위바위보를 합니다.");

		do {
			System.out.println("가위 바위 보! >>");
			userSelect = sc.next();
			if (userSelect.equals("그만"))
				break;

			n = (int) (Math.random() * 3);
			/*
			 * 0.0xxx~0.9xxx까지의 난수값을 발생시킨 후 x3을 했을 때 나오는 값의 정수부분만 취득하여 "가위", "바위", "보" 할당 (0, 1, 2)
			 */
			comSelect = str[n];
			if (userSelect.equals("가위")) {
				if (str[n].equals("가위")) {
					System.out.println("당신=" + userSelect + ", 컴퓨터=" + comSelect + " 비겼습니다.");
					continue;
				} else if (str[n].equals("바위")) {
					System.out.println("당신=" + userSelect + ", 컴퓨터=" + comSelect + " 당신이 졌습니다.");
					continue;
				} else if (str[n].equals("보")) {
					System.out.println("당신=" + userSelect + ", 컴퓨터=" + comSelect + " 당신이 이겼습니다.");
					continue;
				}
			}

			if (userSelect.equals("바위")) {
				if (str[n].equals("가위")) {
					System.out.println("당신=" + userSelect + ", 컴퓨터=" + comSelect + " 당신이 이겼습니다.");
					continue;
				} else if (str[n].equals("바위")) {
					System.out.println("당신=" + userSelect + ", 컴퓨터=" + comSelect + " 비겼습니다.");
					continue;
				} else if (str[n].equals("보")) {
					System.out.println("당신=" + userSelect + ", 컴퓨터=" + comSelect + " 당신이 졌습니다.");
					continue;
				}
			}

			if (userSelect.equals("보")) {
				if (str[n].equals("가위")) {
					System.out.println("당신=" + userSelect + ", 컴퓨터=" + comSelect + " 당신이 졌습니다.");
					continue;
				} else if (str[n].equals("바위")) {
					System.out.println("당신=" + userSelect + ", 컴퓨터=" + comSelect + " 당신이 이겼습니다.");
					continue;
				} else if (str[n].equals("보")) {
					System.out.println("당신=" + userSelect + ", 컴퓨터=" + comSelect + " 비겼습니다.");
					continue;
				}
			}
			System.out.println("사용자=" + userSelect + ", 컴퓨터=" + comSelect + " ");

		} while (true);
		System.out.println("게임을 종료합니다.");
		sc.close();
	}
}
