package test;

import java.util.Scanner;

public class Q14_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[]; // 배열만 선언
		int num;

		System.out.println("생성할 정수의 방 개수를 입력하여 주세요. >>");
		num = sc.nextInt();

		arr = new int[num]; // 배열 생성 (배열의 index에 방을 생성)

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);	// 1~10
			for (int j = 0; j < i; j++)
				if (arr[i] == arr[j])
					i--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 10 == 0 && i != 0)
				System.out.println();
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
